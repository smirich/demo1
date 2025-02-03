package com.example.demo.application.features.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "Yay!!!!!!!";
    }

}
