package com.example.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "task_analysis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private Long userId;
    private int aiPriorityScore;
    private int estimatedCompletionTime;
}

