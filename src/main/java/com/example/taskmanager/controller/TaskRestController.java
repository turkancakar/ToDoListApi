package com.example.taskmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.taskmanager.model.TaskEntity;
import com.example.taskmanager.service.TaskServiceImpl;

@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {

    private final TaskServiceImpl taskService;

    public TaskRestController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskEntity> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public TaskEntity createTask(@RequestBody TaskEntity task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public TaskEntity updateTask(@PathVariable Long id, @RequestBody TaskEntity task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
