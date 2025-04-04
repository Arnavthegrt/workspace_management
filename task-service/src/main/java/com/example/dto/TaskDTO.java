package com.example.dto;

public class TaskDTO {
    private Long id;
    private String taskName;
    private String description;

    // Constructors
    public TaskDTO() {}

    public TaskDTO(Long id, String taskName, String description) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
