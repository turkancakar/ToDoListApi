// Task entity'si için repository interface'i
package com.example.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.model.TaskEntity;

public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {

    List<TaskEntity> findByIsCompleted(Boolean isCompleted);

    List<TaskEntity> findByTitleContainingIgnoreCase(String keyword);
}