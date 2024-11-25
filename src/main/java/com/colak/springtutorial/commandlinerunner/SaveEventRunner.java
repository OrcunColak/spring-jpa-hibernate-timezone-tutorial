package com.colak.springtutorial.commandlinerunner;

import com.colak.springtutorial.jpa.Event;
import com.colak.springtutorial.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class SaveEventRunner implements CommandLineRunner {

    private final EventRepository repository;

    @Override
    public void run(String... args) {

        Event event = new Event();
        event.setName("event1");

        // 25th November 2024, 10:00 AM, Europe/Istanbul time zone
        // This is saved as "2024-11-25 07:00:00"

        // If spring.jpa.properties.hibernate.jdbc.time_zone=UTC is not set, the LocalDateTime is
        // saved as 2024-11-25 10:00:00
        LocalDateTime createdAt = LocalDateTime.of(2024, 11, 25, 10, 0);
        event.setCreatedAt(createdAt);

        repository.saveAndFlush(event);

    }
}
