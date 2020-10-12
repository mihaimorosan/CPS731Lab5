package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setTitle("Cars For Car Enthusiasts");
        song = new MediaPlayer();
        song = MediaPlayer.create(this,R.raw.song);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                song.stop();
                startActivity(new Intent(SplashScreen.this, CarListActivity.class));
            }
        };
        song.start();
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}