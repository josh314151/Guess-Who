package com.example.josh.guesswho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class YourTurnActivity extends AppCompatActivity {

    public static Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_turn);

        if(CharacterSelectionActivity.selectedCharacter != null)
            player.setChar(CharacterSelectionActivity.selectedCharacter);
    }

    public void guessCharacter(View v) {
        Intent intent = new Intent(this, GuessCharacterActivity.class);
        startActivity(intent);
    }

    public void askQuestion(View v) {
        Intent intent = new Intent(this, AskQuestionActivity.class);
        startActivity(intent);
    }
}
