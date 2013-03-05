package edu.macalester.cs124.guessing;

public class Player {
    
    private int guess;

    public void startNewGame() {
        guess = 0;
    }

    public int nextGuess() {
        return guess;
    }

    public void guessWasLow() {
        guess++;
    }

    public void guessWasHigh() {
        guess--;
    }
}
