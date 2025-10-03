package com.example.demo.application.features.jokes;

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
