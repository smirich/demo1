package com.example.demo.application.features.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MockJokeRepo implements JokeRepository {

    ArrayList<Joke> jokes = new ArrayList<>();

    public MockJokeRepo() {
        jokes.add(new Joke("I'm reading a book about anti-gravity.  I just can't put it down"));
        jokes.add(new Joke("Last night, I dreamt that I was a car muffler.  I woke up exhausted"));
        jokes.add(new Joke("Where did Napolean keep his armies?  In his sleevies!!!"));
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
