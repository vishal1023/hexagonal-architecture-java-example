package org.practice.adapter.input;

import org.practice.domain.Reminder;
import org.practice.port.input.ReminderServicePort;
import org.practice.port.output.ReminderRepositoryPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class ReminderService implements ReminderServicePort {

    private final ReminderRepositoryPort reminderRepository;

    public ReminderService(ReminderRepositoryPort reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @Override
    public Reminder createReminder(String message, String reminderTime) {
        LocalDateTime reminderDateTime = getReminderDateTime(reminderTime);
        Reminder reminder = new Reminder(message, reminderDateTime);

        reminderRepository.save(reminder);

        return reminder;
    }

    @Override
    public Reminder getReminder(String reminderId) {
        return reminderRepository.getReminderById(reminderId);
    }

    private static LocalDateTime getReminderDateTime(String reminderTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(reminderTime, formatter);
    }
}
