package com.example.handlingeventssampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bClick,bLongClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bClick = findViewById(R.id.b_click);
        bLongClick = findViewById(R.id.b_long_click);
        bClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView txtView = findViewById(R.id.textView);
                txtView.setText("Button has been clicked!!");
            }
        });

        bLongClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView txtView = findViewById(R.id.textView);
                txtView.setText("Button has been long clicked!!");
                return true;
            }
        });

        
    }
}