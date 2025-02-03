package com.example.demo.application.jokeusecases;

import java.util.List;

interface JokeRepository {

    List<Joke> retrieveRandomJokes(int howMany);

    int count();

    void addJoke(Joke joke);
}
