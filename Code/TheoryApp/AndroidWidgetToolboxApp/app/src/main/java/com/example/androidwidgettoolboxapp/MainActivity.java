package com.example.androidwidgettoolboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bBackgroundExample = findViewById(R.id.b_background_example);
        Button bWidgetToolbox = findViewById(R.id.b_widget_toolbox);

        bBackgroundExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BackgroundExampleActivity.class);
                startActivity(intent);
            }
        });

        bWidgetToolbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WidgetToolboxActivity.class);
                startActivity(intent);
            }
        });

    }
}