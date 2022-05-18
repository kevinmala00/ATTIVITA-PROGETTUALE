package com.example.androidwidgettoolboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WidgetToolboxActivity extends AppCompatActivity {

    Button bButtonPage, bWebView, bEditTextPage, bOtherWidgetPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_toolbox);

        bButtonPage = findViewById(R.id.b_button);
        bEditTextPage = findViewById(R.id.b_edit_text);
        bOtherWidgetPage= findViewById(R.id.b_other_widget);
        bWebView=findViewById(R.id.b_web_view);

        bOtherWidgetPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetToolboxActivity.this, OtherWidgetActivity.class);
                startActivity(intent);
            }
        });

        bButtonPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetToolboxActivity.this, ButtonsActivity.class);
                startActivity(intent);
            }
        });

        bEditTextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetToolboxActivity.this, EditTextViewActivity.class);
                startActivity(intent);
            }
        });

        bWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetToolboxActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
    }
}