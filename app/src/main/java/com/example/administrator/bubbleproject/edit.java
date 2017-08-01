package com.example.administrator.bubbleproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class edit extends AppCompatActivity {

    private EditText nameInput;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        prefs = getSharedPreferences("NAME_DATA", MODE_PRIVATE);
        String name = prefs.getString("TRACKER_NAME","");

        nameInput = (EditText)findViewById(R.id.nameInput);

        //Set default value
        nameInput.setText(name);

    }

    public void saveData(View view){
        //Get input text.
        String name = nameInput.getText().toString();

        //Save data.
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("TRACKER_NAME", name);
        editor.apply();

        //Return to tracker activity
        startActivity(new Intent(getApplicationContext(),tracker1PageActivity.class));

    }

}
