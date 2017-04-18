package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.settings,menu);
        menu.findItem(R.menu.settings).setIntent(
                new Intent(MainActivity.this, LoginActivity.class));


        return true;

    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.logoff_menu){
            super.onOptionsItemSelected(item);
            startActivity(item.getIntent());
        }
        return true;
    }
*/
}

