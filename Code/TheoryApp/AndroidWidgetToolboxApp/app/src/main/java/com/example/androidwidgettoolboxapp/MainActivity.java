package com.example.androidwidgettoolboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bBackgroundExample = findViewById(R.id.b_background_example);
        Button bBackgroundExample2 = findViewById(R.id.b_background_example2);

        bBackgroundExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BackgroundExampleActivity.class);
                startActivity(intent);
            }
        });

        bBackgroundExample2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BackgroundExampleActivity.class);
                startActivity(intent);
            }
        });

    }
}