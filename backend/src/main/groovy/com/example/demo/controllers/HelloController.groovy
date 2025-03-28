package com.example.demo.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests
class HelloController {

    @GetMapping("/hello")
    String sayHello() {
        "Hello world from backend services!"
    }
}