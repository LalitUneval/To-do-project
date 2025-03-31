package com.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.Task;
import com.todo.repository.TaskRepository;

@Service
public class TaskService {

	 @Autowired
	    private TaskRepository taskRepository;

	    public List<Task> getAllTasks() {
	        return taskRepository.findAll();
	    }

	    public Optional<Task> getTaskById(Long id) {
	        return taskRepository.findById(id);
	    }

	    public Task createTask(Task task) {
	        return taskRepository.save(task);
	    }

	    public List<Task> getTasksByUserId(Long userId) {
	        return taskRepository.findByUserId(userId);
	    }

	    public List<Task> getTasksByCategoryId(Long categoryId) {
	        return taskRepository.findByCategoryId(categoryId);
	    }

	    public void deleteTask(Long id) {
	        taskRepository.deleteById(id);
	    }
	
}
