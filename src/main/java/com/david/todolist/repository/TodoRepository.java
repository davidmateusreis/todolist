package com.david.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
