package com.example.androidwidgettoolboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ButtonsActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        tvResult=findViewById(R.id.tv_result);

        RadioButton rbJavaLanguage =findViewById(R.id.rb_java_language);
        RadioButton rbCLanguage=findViewById(R.id.rb_c_language);

        rbCLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setVisibility(View.VISIBLE);
                tvResult.setText(rbCLanguage.getText());
            }
        });
        rbJavaLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setVisibility(View.VISIBLE);
                tvResult.setText(rbJavaLanguage.getText());
            }
        });
    }
}