package com.thakur.multiple_activity;

import static androidx.constraintlayout.widget.StateSet.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "On Create");
        Toast.makeText(this, "On CREATE", Toast.LENGTH_SHORT).show();

        Button second_third = findViewById(R.id.second_third);
        Button second_first = findViewById(R.id.second_first);

        second_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdActivity = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(thirdActivity);
            }
        });

        second_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstActivity = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(firstActivity);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "On Start");
        Toast.makeText(this, "On START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "On Resume");
        Toast.makeText(this, "On RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "On Pause");
        Toast.makeText(this, "On PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "On Stop");
        Toast.makeText(this, "On STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "On Restart");
        Toast.makeText(this, "On RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "DESTROYED");
        Toast.makeText(this, "On DESTROYED", Toast.LENGTH_SHORT).show();
    }
}