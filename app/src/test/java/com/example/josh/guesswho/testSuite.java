/**
 * testSuite:
 * This java class contains the full suite of test methods pertaining to the "Guess Who?" app.
 *
 * @Date June 12, 2017
 * @Author Josh Brauner, Kyle Jorgensen, Evan Loughlin
 */

package com.example.josh.guesswho;
import org.junit.Test;
import static org.junit.Assert.*;

/** Test 1: testAttributeInquiryMatches
 * Test to ensure that the question asked by the user correctly matches the question
 * which is implemented in the program's logic.
 */

public class testAttributeInquiryMatches {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(2, 1);
    }
}

/** Test 2: testGuessCharacterCorrectly
 * Test to see if game results in win if user (player) guesses character correctly.
 * This should test whether the logic of the game matches correctly when the player guesses
 * their opponent's character. The game should end, resulting in a win for the player.
 *
 */
public class testGuessCharacterCorrectly {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(2, 1);
    }
}

/** Test 3: testGuessCharacterIncorrectly
 * Test case, to ensure that the program's response correctly matches expectations when a player
 * guesses the opponent's character incorrectly. Specifically, the asking player's character
 * selection should be reduced by one.
 *
 */
public class testGuessCharacterIncorrectly {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(2, 1);
    }
}

/** Test 4: testInquireAttribute
 * Test case, whereby the the results of the guess are tested to match the correct
 * response of the program's logic. For instance: if a user guesses whether their opponent's
 * character has black hair and the answer is "No", then following the inquiry, that player's
 * array of possible characters should not contain any character with black hair.
 */
public class testInquireAttribute {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(2, 1);
    }
}

/** Test 5: testWinIfOneRemaining
 * Test case to ensure that any player which has only one possible character remaining will
 * automatically win the game.
 *
 */
public class testWinIfOneRemaining {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(2, 1);
    }
}