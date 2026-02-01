package com.example.todo.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private Long id;
    private String title;
    private boolean completed;
}
