package com.example.administrator.bubbleproject;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        SharedPreferences prefs = getSharedPreferences("NAME_DATA", MODE_PRIVATE);

        //getXXX(key, default value)
        String name = prefs.getString("TRACKER_NAME", "no name");

        //set values
        ((TextView)findViewById(R.id.nameLabel)).setText(name);

    }

    public void showTracker1 (View view) {
        Intent intent = new Intent (this, tracker1PageActivity.class);
        startActivity(intent);


    }

    public void addTracker (View view) {
        Intent intent = new Intent (this, addActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.id_setup) {
            //Write own logic

            Intent intentsetup=new Intent(MainActivity.this,setupActivity.class);
            startActivity(intentsetup);
            return true;
        }
        if (id==R.id.id_settings) {
            //Write own logic

            Intent intentsettings=new Intent(MainActivity.this,settingsActivity.class);
            startActivity(intentsettings);
            return true;
        }
        return true;
    }


}


