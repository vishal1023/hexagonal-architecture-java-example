package org.practice.port.input.adapter.input;

import org.practice.domain.Reminder;
import org.practice.port.input.ReminderServicePort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReminderService implements ReminderServicePort {

    @Override
    public Reminder createReminder(String message, LocalDateTime reminderTime) {
        return null;
    }

    @Override
    public Reminder getReminder(Integer reminderId) {
        return null;
    }

    @Override
    public boolean deleteReminder(Integer reminderId) {
        return false;
    }

    @Override
    public Reminder updateReminder(Integer reminderId, String message, LocalDateTime reminderTime) {
        return null;
    }
}
