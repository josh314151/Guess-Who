package com.example.josh.guesswho;

import java.util.Random;

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
    public Game(Character character) {
        player1 = new Player();
        player2 = new Player();
        player1.setChar(character);
        player1.setAI(false);
        Random rand = new Random();
        player2.setChar(Game.CHARACTERS[rand.nextInt(24)]);
        int firstTurn = rand.nextInt(2);
        if(firstTurn == 0)
            this.turnStart(player1, player2);
        else
            this.turnStart(player2, player1);
    }

    /** Starts each player's turn */
    public void turnStart(Player currPlayer, Player oppPlayer) {
        if (currPlayer.isAI())
            this.compTurn(currPlayer, oppPlayer);
        else
            this.humanTurn(currPlayer, oppPlayer);
    }

    /** set of actions that occur during an AI's turn */
    public void compTurn(Player currPlayer, Player oppPlayer) {
        Random rand = new Random();
        int action = rand.nextInt(2);
        if (action == 0) {
            this.askQuestion(currPlayer, oppPlayer, currPlayer.getInquiry(rand.nextInt(currPlayer.getAskableQuestions().length)));
        } else {
            this.guessCharacter(currPlayer, oppPlayer, oppPlayer.getGuessableCharacters()[rand.nextInt(oppPlayer.getGuessableCharacters().length)]);
        }
        if (playerHasWon(currPlayer, oppPlayer)) {

        } else {
            turnStart(oppPlayer, currPlayer);
        }
    }

    /** set of actions that occur during during a human's turn */
    public void humanTurn(Player currPlayer, Player oppPlayer) {

    }

    /** set of actions that occur when a question has been asked */
    public void askQuestion(Player currPlayer, Player oppPlayer, Inquiry inquiry) {

    }

    /** set of actions that occur when a player guesses a character */
    public void guessCharacter(Player currPlayer, Player oppPlayer, Character character) {

    }

    /** detects if the current player has won */
    public boolean playerHasWon(Player currPlayer, Player oppPlayer) {
        return false;
    }
}
