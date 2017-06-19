package com.example.josh.guesswho;


/**
 * Created by Josh on 2017-06-13.
 */

public class Game{
    /** The set of possible inquiries */
    public static final Inquiry[] INQUIRIES = {new Inquiry(0, "Does your character have blond hair?"), new Inquiry(1, "Does your character have blue hair?"), new Inquiry(2, "Does your character have brown hair?"), new Inquiry(3, "Does your character have black hair?"), new Inquiry(4, "Does your character have red hair?"), new Inquiry(5, "Does your character have short hair?"), new Inquiry(6, "Does your character have long hair?"), new Inquiry(7, "Does your character have headgear?"), new Inquiry(8, "Does your character have a white shirt?"), new Inquiry(9, "Does your character have a green shirt?"), new Inquiry(10, "Does your character have a blue shirt?"), new Inquiry(11, "Does your character have a red shirt?"), new Inquiry(12, "Does your character have a yellow shirt?"), new Inquiry(13, "Does your character play basket ball?"), new Inquiry(14, "Does your character play soccer?"), new Inquiry(15, "Does your character ski?"), new Inquiry(16, "Does your character play golf?"), new Inquiry(17, "Does your character play hockey?"), new Inquiry(18, "Does your character swim?"), new Inquiry(19, "Does your character play tennis?"), new Inquiry(20, "Does your character play volleyball?"), new Inquiry(21, "Does your character do equestrian?"), new Inquiry(22, "Is your character male?"), new Inquiry(23, "Is your character female?"), new Inquiry(24, "Does your character have black skin?"), new Inquiry(25, "Does your character have white skin?")};

    /** The set of characters initialized with corresponding attributes */
    public static final Character[] CHARACTERS = {new Character("alyssa", 1, 1, 1, 4, 1, 1, 1), new Character("becca", 0, 0, 1, 1, 0, 1, 1), new Character("darrell", 4, 0, 0, 4, 0, 0, 0), new Character("dennis", 0, 0, 0, 3, 6, 0, 1), new Character("erica", 2, 1, 0, 0, 6, 1, 1), new Character("fabio", 1, 1, 1, 0, 1, 0, 1), new Character("gary", 2, 0, 1, 0, 6, 0, 1), new Character("gianna", 2, 1, 0, 4, 7, 1, 1), new Character("guy", 1, 0, 0, 4, 2, 0, 1), new Character("jeff", 4, 0, 1, 3, 1, 0, 1), new Character("jill", 2, 1, 1, 2, 1, 1, 1), new Character("julie", 0, 1, 0, 1, 3, 1, 1), new Character("katie", 3, 1, 0, 4, 2, 1, 0), new Character("lee", 4, 0, 0, 2, 2, 0, 1), new Character("madison", 1, 0, 1, 0, 3, 1, 1), new Character("makenzie", 3, 0, 0, 2, 5, 1, 1), new Character("michael", 4, 0, 1, 3, 0, 0, 1), new Character("michelle", 3, 1, 0, 3, 8, 1, 1), new Character("phil", 3, 0, 0, 2, 3, 0, 1), new Character("stacey", 4, 1, 0, 0, 0, 1, 1), new Character("tia", 3, 1, 1, 3, 1, 1, 0), new Character("tony", 0, 0, 1, 1, 0, 0, 1), new Character("wayne", 2, 0, 0, 3, 4, 0, 0), new Character("zano", 0, 0, 0, 2, 4, 0, 1)};

    /** set of actions that occur when a question has been asked */
    public static void askQuestion(Player currPlayer, Player oppPlayer, Inquiry inquiry) {

    }

    /** set of actions that occur when a player guesses a character */
    public static void guessCharacter(Player currPlayer, Player oppPlayer, Character character) {

    }

    /** detects if the current player has won */
    public static boolean playerHasWon(Player currPlayer, Player oppPlayer) {
        return false;
    }
}
