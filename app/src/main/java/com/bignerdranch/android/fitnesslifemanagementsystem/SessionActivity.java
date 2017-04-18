package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }

    public void onClick(View view){
        int button = view.getId();

        if(button == R.id.sessionAdd){
            Intent intent = new Intent(SessionActivity.this, AddActivity.class);
            startActivity(intent);
        }

        if(button == R.id.sessionDetails){
            Intent intent = new Intent(SessionActivity.this, SessionDetailsActivity.class);
            startActivity(intent);
        }

        if(button == R.id.saveButton){
            Intent intent = new Intent(SessionActivity.this, CustomersActivity.class);
            startActivity(intent);
        }

    }
}
