package com.example.androidwidgettoolboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

/**
 * This activity shows how to use webView, a view which allow us to show html file or data.
 * Remember to provide internet access in manifest:
 * add this line before application tag
 * <uses-permission android:name="android.permission.INTERNET"/>
 */
public class WebViewActivity extends AppCompatActivity {

    String url = "https://github.com/kevinmala00/Android-Programming";
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //how to show an web page
        setContentView(R.layout.activity_web_view);
        webView=findViewById(R.id.wb_git_hub_page);
        webView.loadUrl(url);
    }
}