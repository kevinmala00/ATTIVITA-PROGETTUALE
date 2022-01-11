package com.example.androidprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        RelativeLayout rlHome = findViewById(R.id.rl_home);
        RelativeLayout rlProfile = findViewById(R.id.rl_profile);
        RelativeLayout rlGitHubRepo = findViewById(R.id.rl_git_hub_repo);

        rlHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        rlProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        rlGitHubRepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlGitHubRepo = getApplication().getString(R.string.url_github_repo);
                openWebPage(urlGitHubRepo);

            }
        });
    }
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}