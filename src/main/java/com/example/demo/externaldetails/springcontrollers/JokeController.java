package com.example.demo.externaldetails.springcontrollers;

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

    private JokeManager jokeManager = new JokeManager();

    // public JokeController(JokeManager jokeManager) {
    //     this.jokeManager = jokeManager;
    // }

    @GetMapping("/randomjoke")
    public String getMethodName()
    {
        return jokeManager.getRandomJokes(1).get(0).getJokeContent() + "!!!";
    }

    @GetMapping("/randomjokes")
    public List<Joke> getRandomJokes(@RequestParam int howMany)
    {
        return jokeManager.getRandomJokes(howMany);//howMany
    }

    // @GetMapping("/add")
    // public void getRandomJokes(@RequestParam String joke)
    // {
    //     jokeManager.addJoke(new Joke(joke));//howMany
    // }

}
