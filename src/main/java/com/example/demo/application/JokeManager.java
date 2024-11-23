package com.example.demo.application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Joke;

public class JokeManager {

    public List<Joke> getRandomJokes(int howMany)
    {
        ArrayList<Joke> jokes = new ArrayList<>();
        jokes.add(new Joke(1, "Funny Joke", 3, 2));
        return jokes;
    }
}
