package com.example.josh.guesswho;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AskQuestionActivity extends AppCompatActivity {

    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);
        mp = MediaPlayer.create(AskQuestionActivity.this, R.raw.beep);
        mp.start();

    }
}
