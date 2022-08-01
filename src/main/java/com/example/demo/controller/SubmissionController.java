package com.example.demo.controller;

import com.example.demo.model.Submission;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Exercise 1
@RestController
public class SubmissionController {

    // Untuk mengirimkan data pada url route submit
    @PostMapping("/submit")
    private String submit(@RequestBody Submission submission){
        return submission.getContent();
    }

    // Untuk mengirimkan data berdasarkan params name
    @GetMapping("/hello/{name}")
    private String hello(@PathVariable String name){
        return "Hii " + name;
    }
}
