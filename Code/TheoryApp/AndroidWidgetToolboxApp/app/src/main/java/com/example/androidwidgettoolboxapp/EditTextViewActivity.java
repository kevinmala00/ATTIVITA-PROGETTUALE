package com.example.androidwidgettoolboxapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class EditTextViewActivity extends AppCompatActivity {

    TextInputEditText textInputEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        textInputEditText=findViewById(R.id.text_input_edit_text);
        textInputEditText.getText();
    }
}
