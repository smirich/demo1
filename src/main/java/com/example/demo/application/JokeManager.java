package com.example.demo.application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Joke;
import com.example.demo.externaldetails.repositories.MockJokeRepo;

public class JokeManager {

    JokeRepository jokeRepo = new MockJokeRepo();

    public List<Joke> getRandomJokes(int howMany)
    {
        return jokeRepo.retrieveRandomJokes(howMany) + "!";
    }

    public void addJoke(Joke joke)
    {
        jokeRepo.addJoke(joke);
    }
}
