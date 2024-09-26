package com.example.fitricks;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        ScrollView scrollView = findViewById(R.id.main);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP); }
        });

        VideoView videoView = findViewById(R.id.sprman);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.superman);

        // Set up auto-replay behavior
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });
        videoView.start();
        VideoView videoView1 = findViewById(R.id.videoView6);
        videoView1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bridge);

        // Set up auto-replay behavior
        videoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });
        videoView1.start();
    }
}