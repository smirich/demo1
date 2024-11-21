package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/joke")
    public String getJoke()
    {
        return "HelloWorld!!!  Yay!!! Too Cool!!!!  Tada!!!!!!!";
    }

    //to pull down image from dockerhub and run

}
