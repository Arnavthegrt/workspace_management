package com.example.repository;


import com.example.entity.TaskAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAnalysisRepository extends JpaRepository<TaskAnalysis, Long> {
}
