package org.practice.port.input;

import org.practice.domain.Reminder;

import java.time.LocalDateTime;

public interface ReminderServicePort {

    Reminder createReminder(String message, LocalDateTime reminderTime);

    Reminder getReminder(Integer reminderId);

    boolean deleteReminder(Integer reminderId);

    Reminder updateReminder(Integer reminderId, String message, LocalDateTime reminderTime);
}
