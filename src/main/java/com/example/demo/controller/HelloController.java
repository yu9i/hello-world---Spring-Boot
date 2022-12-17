package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.ResponseBody;
@RestController

public class HelloController {
    @GetMapping(path = "/hello")
    public String Welcome(){
        return "Hello world";
    }
}