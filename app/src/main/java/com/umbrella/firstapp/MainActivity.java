package com.umbrella.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView holamundo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holamundo = findViewById(R.id.txtHolaMundo);
        Log.d("holamundo", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("holamundo", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        holamundo.setText("Where's everyone going? Bingo?");
        Log.d("holamundo", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("holamundo", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("holamundo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("holamundo", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("holamundo", "onRestart");
    }
}