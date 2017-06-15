package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Game {
    public static final Inquiry[] INQUIRIES = {new Inquiry(0, "Does your character have blond hair?")};
    public static final Character[] CHARACTERS = {new Character("alyssa", 0, 0, 0, 0, 0, 0, 0, 0), new Character("becca", 0, 0, 0, 0, 0, 0, 0, 0), new Character("darrell", 0, 0, 0, 0, 0, 0, 0, 0), new Character("dennis", 0, 0, 0, 0, 0, 0, 0, 0), new Character("erica", 0, 0, 0, 0, 0, 0, 0, 0), new Character("fabio", 0, 0, 0, 0, 0, 0, 0, 0), new Character("gary", 0, 0, 0, 0, 0, 0, 0, 0), new Character("gianna", 0, 0, 0, 0, 0, 0, 0, 0), new Character("guy", 0, 0, 0, 0, 0, 0, 0, 0), new Character("jeff", 0, 0, 0, 0, 0, 0, 0, 0), new Character("jill", 0, 0, 0, 0, 0, 0, 0, 0), new Character("julie", 0, 0, 0, 0, 0, 0, 0, 0), new Character("katie", 0, 0, 0, 0, 0, 0, 0, 0), new Character("lee", 0, 0, 0, 0, 0, 0, 0, 0), new Character("madison", 0, 0, 0, 0, 0, 0, 0, 0), new Character("makenzie", 0, 0, 0, 0, 0, 0, 0, 0), new Character("michael", 0, 0, 0, 0, 0, 0, 0, 0), new Character("michelle", 0, 0, 0, 0, 0, 0, 0, 0), new Character("phil", 0, 0, 0, 0, 0, 0, 0, 0), new Character("stacey", 0, 0, 0, 0, 0, 0, 0, 0), new Character("tia", 0, 0, 0, 0, 0, 0, 0, 0), new Character("tony", 0, 0, 0, 0, 0, 0, 0, 0), new Character("wayne", 0, 0, 0, 0, 0, 0, 0, 0), new Character("zano", 0, 0, 0, 0, 0, 0, 0, 0)};
    private Player player1;
    private Player player2;

    public Game() {

    }
    public void turnStart(Player player) {
        if (player.isAI())
            this.compTurn(player);
        else
            this.humanTurn(player);
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
