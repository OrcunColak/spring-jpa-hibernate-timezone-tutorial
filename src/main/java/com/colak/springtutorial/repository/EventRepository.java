package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

