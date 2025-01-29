package com.example.demo.externaldetails.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.application.JokeRepository;
import com.example.demo.domain.Joke;

public class MockJokeRepo implements JokeRepository {

    ArrayList<Joke> jokes = new ArrayList<>();

    public MockJokeRepo() {
        jokes.add(new Joke("I'm reading a book about anti-gravity.  I just can't put it down"));
    }

    @Override
    public List<Joke> retrieveRandomJokes(int howMany)
    {
        Random rnd = new Random();
        ArrayList<Joke> listOfJokes = new ArrayList<>();
        for (int i = 0; i < howMany; i++)
            listOfJokes.add(jokes.get(rnd.nextInt(jokes.size())));

        return listOfJokes;
    }

    @Override
    public int count()
    {
        return jokes.size();
    }

    @Override
    public void addJoke(Joke joke)
    {
        jokes.add(joke);
    }

}
