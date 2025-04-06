package com.example.service;

import com.example.entity.TaskEntity;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    TaskEntity saveTask(TaskEntity task);
    List<TaskEntity> getAllTasks();
    Optional<TaskEntity> getTaskById(Long id);
}
