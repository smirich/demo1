package com.example.demo.adapters.springcontrollers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.JokeManager;
import com.example.demo.domain.Joke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/jokes")
public class JokeController {

    private JokeManager jokeManager;

    public JokeController(JokeManager jokeManager) {
        this.jokeManager = jokeManager;
    }

    @GetMapping("/randomjokes")
    public List<Joke> getRandomJokes(@RequestParam int howMany)
    {
        return jokeManager.getRandomJokes(howMany);
    }

}
