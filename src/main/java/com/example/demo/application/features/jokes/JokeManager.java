package com.example.demo.application.jokeusecases;

import java.util.List;

class JokeManager {

    JokeRepository jokeRepo = new MockJokeRepo();

    public List<Joke> getRandomJokes(int howMany)
    {
        return jokeRepo.retrieveRandomJokes(howMany);
    }

    public void addJoke(Joke joke)
    {
        jokeRepo.addJoke(joke);
    }
}
