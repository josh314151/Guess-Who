package com.example.josh.guesswho;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {


    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        mp = MediaPlayer.create(TitleActivity.this, R.raw.titlemusic);
        mp.start();

    }

    public void playButtonPressed(View v) {
        Intent intent = new Intent(this, CharacterSelectionActivity.class);
        super.onPause();
        mp.release();
        startActivity(intent);
        mp = MediaPlayer.create(TitleActivity.this, R.raw.beep);
        mp.start();

    }
}
