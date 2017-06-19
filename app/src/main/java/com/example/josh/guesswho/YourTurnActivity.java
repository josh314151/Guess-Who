package com.example.josh.guesswho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class YourTurnActivity extends AppCompatActivity {

    public static Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_turn);

        if(CharacterSelectionActivity.selectedCharacter != null)
            player.setChar(CharacterSelectionActivity.selectedCharacter);
    }
}
