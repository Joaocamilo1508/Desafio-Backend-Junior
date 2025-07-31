package com.desafiobackend.todolist.controller;

import com.desafiobackend.todolist.entity.Todo;
import com.desafiobackend.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class Todocontroller {
    private TodoService todoService;

    public Todocontroller(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);

    }
    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    List<Todo> uptade(@RequestBody Todo todo){
        return todoService.update(todo);

    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id ){
        return todoService.delete(id);

    }




}
