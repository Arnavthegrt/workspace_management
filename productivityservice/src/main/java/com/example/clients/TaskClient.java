package com.example.clients;

import com.example.dto.TaskDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "task-service")
public interface TaskClient {
    @PostMapping("/tasks")
    TaskDTO createTask(@RequestBody TaskDTO taskDTO);
}
