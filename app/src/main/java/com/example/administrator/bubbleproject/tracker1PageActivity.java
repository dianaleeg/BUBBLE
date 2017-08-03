package com.example.administrator.bubbleproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tracker1PageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker1_page);

        Intent intent = getIntent();

        SharedPreferences prefs = getSharedPreferences("NAME_DATA", MODE_PRIVATE);

        //getXXX(key, default value)
        String name = prefs.getString("TRACKER_NAME", "Tracker 1");

        //set values
        ((TextView)findViewById(R.id.nameLabel)).setText(name);
    }

    public void tracker1Location (View view) {
        Intent intent = new Intent (this,MapActivity.class);
        startActivity(intent);
    }

    public void showEdit(View view) {
        startActivity(new Intent(getApplicationContext(),edit.class));
    }

    public void streamLocation (View view) {
        Intent intent = new Intent (this,StreamLocation.class);
        startActivity(intent);
    }

}


