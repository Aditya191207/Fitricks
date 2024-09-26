package com.example.fitricks;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ScrollView scrollView = findViewById(R.id.main);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP); }
        });

        VideoView videoView = findViewById(R.id.pushups);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.pushups);

        // Set up auto-replay behavior
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });
        videoView.start();


        VideoView videoView6 = findViewById(R.id.videoView6);
        videoView6.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.inclinepushups);

        // Set up auto-replay behavior
        videoView6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true); // Loop the video
            }
        });

        // Start playing the video
        videoView6.start();


        VideoView videoView4 = findViewById(R.id.pushups3);
        videoView4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.declinepushups);

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
