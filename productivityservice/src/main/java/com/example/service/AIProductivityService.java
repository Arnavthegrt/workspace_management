package com.example.service;

import com.example.entity.*;
import com.example.repository.*;
import com.example.entity.Suggestion;
import com.example.entity.WorkSession;
import com.example.repository.SuggestionRepository;
import com.example.repository.TaskAnalysisRepository;
import com.example.repository.WorkSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AIProductivityService {
    @Autowired
    private WorkSessionRepository workSessionRepo;
    @Autowired
    private TaskAnalysisRepository taskAnalysisRepo;
    @Autowired
    private SuggestionRepository suggestionRepo;

    // Work Session Methods
    public List<WorkSession> getAllWorkSessions() {
        return workSessionRepo.findAll();
    }

    public Optional<WorkSession> getWorkSessionById(Long id) {
        return workSessionRepo.findById(id);
    }

    public WorkSession createWorkSession(WorkSession session) {
        return workSessionRepo.save(session);
    }

    public void deleteWorkSession(Long id) {
        workSessionRepo.deleteById(id);
    }

    // Task Analysis Methods
    public List<TaskAnalysis> getAllTaskAnalysis() {
        return taskAnalysisRepo.findAll();
    }

    public Optional<TaskAnalysis> getTaskAnalysisById(Long id) {
        return taskAnalysisRepo.findById(id);
    }

    public TaskAnalysis createTaskAnalysis(TaskAnalysis task) {
        return taskAnalysisRepo.save(task);
    }

    public void deleteTaskAnalysis(Long id) {
        taskAnalysisRepo.deleteById(id);
    }

    // Suggestion Methods
    public List<Suggestion> getAllSuggestions() {
        return suggestionRepo.findAll();
    }

    public Optional<Suggestion> getSuggestionById(Long id) {
        return suggestionRepo.findById(id);
    }

    public Suggestion createSuggestion(Suggestion suggestion) {
        return suggestionRepo.save(suggestion);
    }

    public void deleteSuggestion(Long id) {
        suggestionRepo.deleteById(id);
    }
}

