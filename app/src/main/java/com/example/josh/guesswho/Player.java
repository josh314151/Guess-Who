package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Player {
    private boolean isAI;
    private Character chosenChar;
    private Character[] guessableCharacters;
    private Inquiry[] askableQuestions;

    public void setChar(Character chosenChar) {

    }

    public Inquiry getInquiry(int lookup) {
        return askableQuestions[0];
    }

    public Inquiry[] getAskableQuestions() {
        return askableQuestions;
    }

    public Character getChar() {
        return chosenChar;
    }

    public Character[] getGuessableCharacters() {
        return guessableCharacters;
    }

    public boolean isAI() {
        return isAI;
    }
}
