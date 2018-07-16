package com.dell.myapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SoundPool sp;
    int sound1;
    int sound2;
    int sound3;
    int sound4;
    int sound5;
     int sound6;
    int sound7;
    int sound8;
    int sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.sound1,1);
        sound2 = sp.load(getApplicationContext(),R.raw.sound2,1);
        sound3 = sp.load(getApplicationContext(),R.raw.sound3,1);
        sound4 = sp.load(getApplicationContext(),R.raw.sound4,1);
        sound5= sp.load(getApplicationContext(),R.raw.sound5,1);
        sound6= sp.load(getApplicationContext(),R.raw.sound6,1);
        sound7 = sp.load(getApplicationContext(),R.raw.sound7,1);
        sound8 = sp.load(getApplicationContext(),R.raw.sound8,1);
        sound9= sp.load(getApplicationContext(),R.raw.sound9,1);
    }

    public void play1(View v){
        sp.play(sound1,1.0f,1.0f,0,0,10f);

    }
    public void play2(View v){
        sp.play(sound2,1.0f,1.0f,0,0,10f);

    }
    public void play3(View v){
        sp.play(sound3,1.0f,1.0f,0,0,10f);

    }

    public void play4(View v){
        sp.play(sound4,1.0f,1.0f,0,0,1.0f);

    }
    public void play5(View v){
        sp.play(sound5,1.0f,1.0f,0,0,10f);

    }
    public void play6(View v){
        sp.play(sound6,1.0f,1.0f,0,0,10f);

    }
    public void play7(View v){
        sp.play(sound7,1.0f,1.0f,0,0,10f);

    }
    public void play8(View v) {
        sp.play(sound8,1.0f,1.0f,0,0,10f);

    }
    public void play9(View v){
        sp.play(sound9,1.0f,1.0f,0,0,10f);

    }
}
