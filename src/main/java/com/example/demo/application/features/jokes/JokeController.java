package com.example.demo.application.jokeusecases;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/jokes")
class JokeController {

    private JokeManager jokeManager = new JokeManager();

    // public JokeController(JokeManager jokeManager) {
    //     this.jokeManager = jokeManager;
    // }

    @GetMapping("/randomjoke")
    public String getMethodName()
    {
        return jokeManager.getRandomJokes(1).get(0).getJokeContent() + "!!!***";
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
