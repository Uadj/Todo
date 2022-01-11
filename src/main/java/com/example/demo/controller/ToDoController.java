package com.example.demo.controller;

import com.example.demo.entity.ToDoResponse;
import com.example.demo.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@Controller
@RequestMapping("/")
public class ToDoController {
    private final ToDoService toDoService;

    @PostMapping
    public ResponseEntity<ToDoResponse> create(){
        System.out.println("CREATE");
        return null;
    }
    @GetMapping
    public ResponseEntity<ToDoResponse> readOne(){
        System.out.println("READ ONE");
        return null;
    }
    @GetMapping
    public ResponseEntity<ToDoResponse> readAll(){
        System.out.println("READ ALL");
        return null;
    }
    @PatchMapping
    public ResponseEntity<ToDoResponse> update(){
        System.out.println("UPDATE");
        return null;
    }
    @DeleteMapping
    public ResponseEntity<?> deleteOne(){
        System.out.println("DELETE");
        return null;
    }
    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        System.out.println("DELETE ALL");
        return null;
    }
}
