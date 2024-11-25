package com.colak.springtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity

// spring.jpa.properties.hibernate.jdbc.time_zone=UTC:
// This configuration ensures that Hibernate converts all timestamps to UTC before saving them to the database.
// This only applies to fields of type java.time.LocalDateTime or java.sql.Timestamp.
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "created_at_utc", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;
}

