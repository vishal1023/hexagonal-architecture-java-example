package org.practice.port.input;

import org.practice.domain.Reminder;

public interface ReminderServicePort {

    Reminder createReminder(String message, String reminderTime);

    Reminder getReminder(String reminderId);
}
