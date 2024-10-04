package com.bjxls.timenote.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "user") String name) {
        return "hello! " + name + "!";
    }
}
