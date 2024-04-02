package com.example.todorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test correct";
    }

    @GetMapping("/test1")
    public String test1() {
        return "test correct1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test correct2";
    }
}
