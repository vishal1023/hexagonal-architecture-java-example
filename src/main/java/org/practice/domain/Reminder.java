package org.practice.domain;

import java.time.LocalDateTime;

public class Reminder {

    private final Integer id;
    private final String message;
    private final LocalDateTime reminderTime;

    public Reminder(Integer id, String message, LocalDateTime reminderTime) {
        this.id = id;
        this.message = message;
        this.reminderTime = reminderTime;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getReminderTime() {
        return reminderTime;
    }
}
