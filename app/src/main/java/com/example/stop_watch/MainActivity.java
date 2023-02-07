package com.example.stop_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Chronometer timer;
    boolean run;
    private long pauseOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = findViewById(R.id.textView);
    }

    public void start(View v) {
        if (!run) {
            timer.setBase(SystemClock.elapsedRealtime() - pauseOff);
            timer.start();
            run = true;
        } else {
        }
    }

    public void stop(View v) {
        if (run) {
            pauseOff = SystemClock.elapsedRealtime() - timer.getBase();
            timer.stop();
            run = false;
        }
        else{
        }
    }

    public void reset(View v) {
        timer.setBase(SystemClock.elapsedRealtime());
        pauseOff = 0;
    }
}