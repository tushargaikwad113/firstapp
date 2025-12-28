package com.tushar.firstapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public ResponseEntity<String> getHellow(){

        return ResponseEntity.ok("Hi This is my application");
    }
}
