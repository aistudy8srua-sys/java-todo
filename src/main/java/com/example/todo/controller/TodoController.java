package com.example.todo.controller;

import com.example.todo.todo.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TodoController {
    @GetMapping("/todos")
    public List<Todo> getTosod() {
        return List.of(
            new Todo(1L, "Javaを学ぶ", false),
            new Todo(2L, "Spring Bootを学ぶ", true)
        );
    }
    
}
