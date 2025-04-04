package com.example.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "work_sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;
    private Long userId;
    private int duration;
    private int distractionLevel;
}

