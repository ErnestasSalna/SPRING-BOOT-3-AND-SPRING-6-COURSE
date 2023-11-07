package com.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
