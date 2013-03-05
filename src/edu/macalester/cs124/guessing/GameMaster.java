package edu.macalester.cs124.guessing;

import java.util.Random;

public class GameMaster {

    public static final int LOW = -1, CORRECT = 0, HIGH = 1;
    
    private final Random rand = new Random();
    private int answer;
    private int guessCount;

    public void startNewGame() {
        answer = rand.nextInt(100);
        guessCount = 0;
    }

    public int submitGuess(int guess) {
        guessCount++;
        if(guess < answer) {
            return LOW;
        } else if(guess > answer) {
            return HIGH;
        } else {
            return CORRECT;
        }
    }

    public int getGuessCount() {
        return guessCount;
    }
}
