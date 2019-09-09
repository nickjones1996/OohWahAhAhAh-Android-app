package com.example.oohwahahahah;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playOriginal(View view)
    {
        if(mp == null) {
            mp = MediaPlayer.create(this, R.raw.owaa);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.reset();
                    mediaPlayer.release();
                    mp = null;
                }
            });
            mp.start();
        }
    }
    public void playVine(View view)
    {
        if(mp == null) {
            mp = MediaPlayer.create(this, R.raw.owaavine);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.reset();
                    mediaPlayer.release();
                    mp = null;
                }
            });
            mp.start();
        }
    }
    public void playSoundOnly(View view)
    {
        if(mp == null) {
            mp = MediaPlayer.create(this, R.raw.soundonly);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.reset();
                    mediaPlayer.release();
                    mp = null;
                }
            });
            mp.start();
        }
    }
}
