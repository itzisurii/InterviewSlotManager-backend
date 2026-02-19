package edu.iCET.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Candidate candidate;

    @OneToOne
    private InterviewSlot slot;

    private String cvPath;
    private LocalDateTime createdAt;
}
