package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "Running on Docker Play!!!!  Did it pick up the change?  Let's try this again..and one more time";
    }

}
