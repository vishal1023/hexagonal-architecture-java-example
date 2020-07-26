package org.practice.adapter.output;

import org.practice.domain.Reminder;
import org.practice.exception.ReminderNotFoundException;
import org.practice.port.output.ReminderRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ReminderInMemoryRepository implements ReminderRepositoryPort {

    private static final Map<String, Reminder> REMINDER_STORAGE = new ConcurrentHashMap<>();

    @Override
    public void save(Reminder reminder) {
        REMINDER_STORAGE.put(reminder.getId(), reminder);
    }

    @Override
    public Reminder getReminderById(String reminderId) {
        Reminder reminder = REMINDER_STORAGE.get(reminderId);
        if (reminder == null) {
            throw new ReminderNotFoundException("Reminder Not found");
        }
        return reminder;
    }
}
