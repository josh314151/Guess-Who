package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Player {
    private Character chosenChar;
    private Character[] guessableCharacters;
    private Inquiry[] askableQuestions;

    public Player() {
        this.askableQuestions = Game.INQUIRIES;
        guessableCharacters = Game.CHARACTERS;
    }


    public void setChar(Character chosenChar) {
        this.chosenChar = chosenChar;
    }

    public void setGuessableCharacters(int i, Character character) {
        this.guessableCharacters[i] = character;
    }

    public Inquiry getInquiry(int lookup) {
        return askableQuestions[lookup];
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
}
