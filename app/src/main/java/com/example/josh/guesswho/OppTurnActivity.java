package com.example.josh.guesswho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class OppTurnActivity extends AppCompatActivity {
    public static Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opp_turn);

        Random rand = new Random();
        int action = rand.nextInt(2);
        if (action == 0) {
            Game.askQuestion(this.player, YourTurnActivity.player, this.player.getInquiry(rand.nextInt(this.player.getAskableQuestions().length)));
        } else {
            Game.guessCharacter(this.player, YourTurnActivity.player, YourTurnActivity.player.getGuessableCharacters()[rand.nextInt(YourTurnActivity.player.getGuessableCharacters().length)]);
        }
        if (Game.playerHasWon(this.player, YourTurnActivity.player)) {

        } else {
            Intent intent = new Intent(this, YourTurnActivity.class);
        }
    }
}
