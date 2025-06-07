package com.toDo.toDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toDo.toDoList.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
	

}
