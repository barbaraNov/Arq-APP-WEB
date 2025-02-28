package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @GetMapping("/test")
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/World")
    public String World (@RequestParam String name ){
    return "Hello" + name + "Bárbara";
    }
}
