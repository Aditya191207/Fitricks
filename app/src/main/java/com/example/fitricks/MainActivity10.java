package com.example.fitricks;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ScrollView scrollView = findViewById(R.id.main);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP); }
        });


        VideoView videoView = findViewById(R.id.squats);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.squats);

        // Set up auto-replay behavior
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });
        videoView.start();

        VideoView videoView2 = findViewById(R.id.lunges);
        videoView2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lunges);

        // Set up auto-replay behavior
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });

        // Start playing the video
        videoView2.start();

        VideoView videoView4 = findViewById(R.id.sidelunges);
        videoView4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.sidelunges);

        // Set up auto-replay behavior
        videoView4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });

        // Start playing the video
        videoView4.start();



    }
}
