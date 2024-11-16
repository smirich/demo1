package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "HelloWorld!!!  Yay!!! Too Cool!!!!";
    }

}
