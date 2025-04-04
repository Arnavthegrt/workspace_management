package com.example.controller;


import com.example.entity.Suggestion;
import com.example.entity.TaskAnalysis;
import com.example.service.AIProductivityService;
import com.example.entity.WorkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ai-productivity")
public class AIProductivityController {
    @Autowired
    private AIProductivityService service;

    // Work Sessions API
    @GetMapping("/work-sessions")
    public List<WorkSession> getWorkSessions() {
        return service.getAllWorkSessions();
    }

    @GetMapping("/work-sessions/{id}")
    public Optional<WorkSession> getWorkSessionById(@PathVariable Long id) {
        return service.getWorkSessionById(id);
    }

    @PostMapping("/work-sessions")
    public WorkSession createWorkSession(@RequestBody WorkSession session) {
        return service.createWorkSession(session);
    }

    @DeleteMapping("/work-sessions/{id}")
    public void deleteWorkSession(@PathVariable Long id) {
        service.deleteWorkSession(id);
    }

    // Task Analysis API
    @GetMapping("/task-analysis")
    public List<TaskAnalysis> getTaskAnalysis() {
        return service.getAllTaskAnalysis();
    }

    @GetMapping("/task-analysis/{id}")
    public Optional<TaskAnalysis> getTaskAnalysisById(@PathVariable Long id) {
        return service.getTaskAnalysisById(id);
    }

    @PostMapping("/task-analysis")
    public TaskAnalysis createTaskAnalysis(@RequestBody TaskAnalysis task) {
        return service.createTaskAnalysis(task);
    }

    @DeleteMapping("/task-analysis/{id}")
    public void deleteTaskAnalysis(@PathVariable Long id) {
        service.deleteTaskAnalysis(id);
    }

    // Suggestions API
    @GetMapping("/suggestions")
    public List<Suggestion> getSuggestions() {
        return service.getAllSuggestions();
    }

    @GetMapping("/suggestions/{id}")
    public Optional<Suggestion> getSuggestionById(@PathVariable Long id) {
        return service.getSuggestionById(id);
    }

    @PostMapping("/suggestions")
    public Suggestion createSuggestion(@RequestBody Suggestion suggestion) {
        return service.createSuggestion(suggestion);
    }

    @DeleteMapping("/suggestions/{id}")
    public void deleteSuggestion(@PathVariable Long id) {
        service.deleteSuggestion(id);
    }
}

