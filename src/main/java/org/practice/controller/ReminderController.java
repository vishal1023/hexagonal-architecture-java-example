package org.practice.controller;

import org.practice.domain.Reminder;
import org.practice.port.input.ReminderServicePort;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController("/reminder")
public class ReminderController {

    private final ReminderServicePort reminderService;

    public ReminderController(ReminderServicePort reminderService) {
        this.reminderService = reminderService;
    }

    @PostMapping("/creat")
    public Reminder addReminder(@RequestParam String message, @RequestParam LocalDateTime reminderTime) {
        return reminderService.createReminder(message, reminderTime);
    }

    @GetMapping("/{id}")
    public Reminder getReminder(@PathVariable Integer id) {
        return reminderService.getReminder(id);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteReminder(@PathVariable Integer id) {
        return reminderService.deleteReminder(id);
    }

    @PutMapping("/{id}")
    public Reminder updateReminder(@PathVariable Integer id, @RequestParam String message, @RequestParam LocalDateTime reminderTime) {
        return reminderService.updateReminder(id, message, reminderTime);
    }

}
