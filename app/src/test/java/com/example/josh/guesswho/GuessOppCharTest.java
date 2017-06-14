/**
 * testSuite:
 * This java class contains the full suite of test methods pertaining to the "Guess Who?" app.
 *
 * @Date June 12, 2017
 * @Author Josh Brauner, Kyle Jorgensen, Evan Loughlin
 */

package com.example.josh.guesswho;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GuessOppCharTest {
    
    private Character[] testArray;
    private Player compPlayer = new Player();
    private Player humPlayer = new Player();
    private Game game = new Game();
    
    @Before
    public void before() {
        compPlayer.setChar(game.CHARACTERS[0]);
    }
    
    @After
    public void after() {
        testArray = game.CHARACTERS;
    }

    /** Test 1: testAttributeInquiryMatches
    * Test to ensure that the question asked by the user correctly matches the question
    * which is implemented in the program's logic.
    */
    @Test
    public void testAttributeInquiryMatches() throws Exception {
        assertEquals(0, (compPlayer.getInquiry(0)).getLookup());
    }

    /** Test 2: testGuessCharacterCorrectly
    * Test to see if game results in win if user (player) guesses character correctly.
    * This should test whether the logic of the game matches correctly when the player guesses
    * their opponent's character. The game should end, resulting in a win for the player.
    *
    */
    @Test
    public void testGuessCharacterCorrectly() throws Exception {
        assertEquals(true, game.playerHasWon());
    }

    /** Test 3: testGuessCharacterIncorrectly
    * Test case, to ensure that the program's response correctly matches expectations when a player
    * guesses the opponent's character incorrectly. Specifically, the asking player's character
    * selection should be reduced by one.
    *
    */
    @Test
    public void testGuessCharacterIncorrectly() throws Exception {
        game.guessCharacter(compPlayer, game.CHARACTERS[0]);
        testArray[0] = null;
        assertArrayEquals(testArray, compPlayer.getGuessableCharacters());
    }

    /** Test 4: testInquireAttribute
    * Test case, whereby the the results of the guess are tested to match the correct
    * response of the program's logic. For instance: if a user guesses whether their opponent's
    * character has black hair and the answer is "No", then following the inquiry, that player's
    * array of possible characters should not contain any character with black hair.
    */
    @Test
    public void testInquireAttribute() throws Exception {
        game.askQuestion(compPlayer, compPlayer.getInquiry(0));
        testArray[0] = null;
        assertArrayEquals(testArray, compPlayer.getGuessableCharacters());
    }

    /** Test 5: testWinIfOneRemaining
    * Test case to ensure that any player which has only one possible character remaining will
    * automatically win the game.
    *
    */
    @Test
    public void testWinIfOneRemaining() throws Exception {
        assertEquals(true, game.playerHasWon());
    }
}
