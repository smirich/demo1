package com.example.demo.domain;

public class Joke {
    protected int jokeID;
    protected String jokeContent;
    protected int numThumbsUp;
    protected int numThumbsDown;

    public Joke(int jokeID, String jokeContent, int numThumbsUp, int numThumbsDown) {
        this.jokeID = jokeID;
        this.jokeContent = jokeContent;
        this.numThumbsUp = numThumbsUp;
        this.numThumbsDown = numThumbsDown;
    }

    public int getJokeID()
    {
        return jokeID;
    }

    public String getJokeContent()
    {
        return jokeContent;
    }

    public int getNumThumbsUp()
    {
        return numThumbsUp;
    }

    public void setNumThumbsUp(int numThumbsUp)
    {
        this.numThumbsUp = numThumbsUp;
    }

    public int getNumThumbsDown()
    {
        return numThumbsDown;
    }

    public void setNumThumbsDown(int numThumbsDown)
    {
        this.numThumbsDown = numThumbsDown;
    }

}
