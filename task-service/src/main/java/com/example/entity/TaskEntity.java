package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long taskId;
        private Long userId;
        private String title;
        private String priority;
        private LocalDate dueDate;
        private String status;
    }