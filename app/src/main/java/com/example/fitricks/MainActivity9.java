package com.example.fitricks;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);
        ScrollView scrollView = findViewById(R.id.main);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP); }
        });
        VideoView videoView = findViewById(R.id.bcp1);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bcp);

        // Set up auto-replay behavior
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });
        videoView.start();

    }
}