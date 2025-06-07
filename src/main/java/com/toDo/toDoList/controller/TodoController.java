package com.toDo.toDoList.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDo.toDoList.entity.Todo;
import com.toDo.toDoList.service.TodoService;

@RestController
@RequestMapping("/todos")

public class TodoController {
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		
		this.todoService = todoService;
	}

	@PostMapping
	List<Todo> create(@RequestBody Todo todo) {
		return todoService.create(todo);

	}

	@GetMapping
	List<Todo> list(Todo todo) {
		return todoService.list();

	}

	@PutMapping
	List<Todo> update(@RequestBody Todo todo) {
		return todoService.update(todo);

	}

	@DeleteMapping
	List<Todo> delete(Long id) {
		return todoService.delete(id);

	}

}
