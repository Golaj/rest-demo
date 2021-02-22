package com.example.simplerestdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello handsome!";
    }

    @GetMapping("/error")
    public String error() {
        return "Mapping not found";
    }
}
