package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Player {
    private boolean isAI;
    private Character chosenChar;
    private Character[] guessableCharacters;
    private Inquiry[] askableQuestions;

    public Player() {
        this.isAI = true;
        this.askableQuestions = Game.INQUIRIES;
        for (int i = 0; i < askableQuestions.length; i++) {
            askableQuestions[i] = new Inquiry();
        }
        guessableCharacters = new Character[24];
        for (int i = 0; i < guessableCharacters.length; i++) {
            guessableCharacters[i] = new Character("", 0, 0, 0, 0, 0, 0, 0, 0);
        }
    }

    public void setAI(boolean b) {
        this.isAI = b;
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

    public boolean isAI() {
        return isAI;
    }
}
