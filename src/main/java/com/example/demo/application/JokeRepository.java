package com.example.demo.application;

import java.util.List;

import com.example.demo.domain.Joke;

public interface JokeRepository {

    List<Joke> retrieveRandomJokes(int howMany);

    int count();

    void addJoke(Joke joke);
}
