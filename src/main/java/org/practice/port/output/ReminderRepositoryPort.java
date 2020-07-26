package org.practice.port.output;

import org.practice.domain.Reminder;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepositoryPort {

    void save(Reminder reminder);

    Reminder getReminderById(String reminderId);
}
