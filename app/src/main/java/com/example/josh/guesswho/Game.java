package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Game {
    public static final Inquiry[] INQUIRIES = new Inquiry[24];
    public static final Character[] CHARACTERS = new Character[24];
    private Player player1;
    private Player player2;

    public Game() {
        for (int i = 0; i < INQUIRIES.length; i++) {
            INQUIRIES[i] = new Inquiry();
        }
        for (int i = 0; i < CHARACTERS.length; i++) {
            CHARACTERS[i] = new Character("", 0, 0);
        }
    }
    public void turnStart(Player player) {

    }

    public void compTurn(Player player) {

    }

    public void humanTurn(Player player) {

    }

    public void askQuestion(Player player, Inquiry inquiry) {
        player.setGuessableCharacters(1, null);
        player.setGuessableCharacters(3, null);
        player.setGuessableCharacters(11, null);
        player.setGuessableCharacters(21, null);
    }

    public void guessCharacter(Player player, Character character) {
        player.setGuessableCharacters(1, null);
    }

    public boolean playerHasWon() {
        return true;
    }
}
