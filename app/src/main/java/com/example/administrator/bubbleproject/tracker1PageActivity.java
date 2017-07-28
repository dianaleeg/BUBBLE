package com.example.administrator.bubbleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tracker1PageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker1_page);

        Intent intent = getIntent();

    }

    public void tracker1Location (View view) {
        Intent intent = new Intent (this,MapActivity.class);
        startActivity(intent);
    }
}
