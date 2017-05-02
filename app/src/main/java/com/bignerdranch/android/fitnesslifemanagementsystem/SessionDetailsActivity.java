package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class SessionDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_details);
    }

    public void onClick(View view) {
        int button = view.getId();



        if (button == R.id.saveButton) {
            Intent intent = new Intent(SessionDetailsActivity.this, SessionActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);

        return true;
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.logoff_menu:
                Intent i = new Intent(SessionDetailsActivity.this, LoginActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
