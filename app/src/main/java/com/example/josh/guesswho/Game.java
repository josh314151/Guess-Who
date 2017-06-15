package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Game {
    /** The set of possible inquiries */
    //TODO have one for each attribute, should total 27
    public static final Inquiry[] INQUIRIES = {new Inquiry(0, "Does your character have blond hair?")};

    /** The set of characters initialized with corresponding attributes */
    public static final Character[] CHARACTERS = {new Character("alyssa", 1, 1, 1, 4, 1, 1, 1), new Character("becca", 0, 0, 1, 1, 0, 1, 1), new Character("darrell", 4, 0, 0, 4, 0, 0, 0), new Character("dennis", 0, 0, 0, 3, 6, 0, 1), new Character("erica", 2, 1, 0, 0, 6, 1, 1), new Character("fabio", 1, 1, 1, 0, 1, 0, 1), new Character("gary", 2, 0, 1, 0, 6, 0, 1), new Character("gianna", 2, 1, 0, 4, 7, 1, 1), new Character("guy", 1, 0, 0, 4, 2, 0, 1), new Character("jeff", 4, 0, 1, 3, 1, 0, 1), new Character("jill", 2, 1, 1, 2, 1, 1, 1), new Character("julie", 0, 1, 0, 1, 3, 1, 1), new Character("katie", 3, 1, 0, 4, 2, 1, 0), new Character("lee", 4, 0, 0, 2, 2, 0, 1), new Character("madison", 1, 0, 1, 0, 3, 1, 1), new Character("makenzie", 3, 0, 0, 2, 5, 1, 1), new Character("michael", 4, 0, 1, 3, 0, 0, 1), new Character("michelle", 3, 1, 0, 3, 8, 1, 1), new Character("phil", 3, 0, 0, 2, 3, 0, 1), new Character("stacey", 4, 1, 0, 0, 0, 1, 1), new Character("tia", 3, 1, 1, 3, 1, 1, 0), new Character("tony", 0, 0, 1, 1, 0, 0, 1), new Character("wayne", 2, 0, 0, 3, 4, 0, 0), new Character("zano", 0, 0, 0, 2, 4, 0, 1)};
    private Player player1;
    private Player player2;

    /** Constructor for the game */
    /** Not needed for testing */
    public Game() {

    }

    /** Starts each player's turn */
    /** Not needed for testing */
    public void turnStart(Player player) {
        if (player.isAI())
            this.compTurn(player);
        else
            this.humanTurn(player);
    }

    /** set of actions that occur during an AI's turn */
    /** Not needed for testing */
    public void compTurn(Player player) {

    }

    /** set of actions that occur during during a human's turn */
    /** Not needed for testing */
    public void humanTurn(Player player) {

    }

    /** set of actions that occur when a question has been asked */
    //TODO implement an appropriate set of actions based on inquiry and opponent's chosen character
    public void askQuestion(Player player, Inquiry inquiry) {
        player.setGuessableCharacters(1, null);
        player.setGuessableCharacters(3, null);
        player.setGuessableCharacters(11, null);
        player.setGuessableCharacters(21, null);
    }

    /** set of actions that occur when a player guesses a character */
    //TODO detect if guess is correct and perform appropriate actions
    public void guessCharacter(Player player, Character character) {
        player.setGuessableCharacters(1, null);
    }

    /** detects if the current player has won */
    //TODO detect win conditions
    public boolean playerHasWon() {
        return true;
    }
}
