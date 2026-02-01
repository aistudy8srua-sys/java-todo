package com.example.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;

@RestController
@RequestMapping(
    value = "/todos",
    produces = "application/json; charset=UTF-8"
)
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        // id は触らない！DBに任せる！
        return todoRepository.save(todo);
    }
}
