package com.example.demo.application.features.jokes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JokeManagerTests {

    JokeManager jokeManager;

    @BeforeEach
    public void init()
    {
        jokeManager = new JokeManager();
    }

    @Test
    public void callinggetRandJokes_returnsListOfJoke()
    {
        assertTrue(jokeManager.getRandomJokes(1) instanceof List<Joke>);
    }

    @Test
    public void callingRandomJokeWithArgOf0_resultsInEmptyList()
    {
        assertEquals(jokeManager.getRandomJokes(0).size(), 0);
    }

    @Test
    void callingRandomJokeWithArgOf3_resultsInListOf3Jokes()
    {

        assertEquals(jokeManager.getRandomJokes(3).size(), 3);
        assertTrue(jokeManager.getRandomJokes(3).get(0).getJokeContent().length() > 0);
    }

}
