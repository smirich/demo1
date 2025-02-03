package com.example.demo.application.features.jokes;

class Joke {
    protected int jokeID;
    protected String jokeContent;
    protected int numThumbsUp;
    protected int numThumbsDown;
    private static int jokeCounter;

    public Joke(String jokeContent) {
        this.jokeID = jokeCounter++;
        this.jokeContent = jokeContent;

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
