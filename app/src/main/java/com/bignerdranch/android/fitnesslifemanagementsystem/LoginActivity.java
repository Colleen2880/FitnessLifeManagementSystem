package com.bignerdranch.android.fitnesslifemanagementsystem;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;





public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void onClick(View v) {
        if (v.getId() == R.id.loginbutton) {
            Intent i = new Intent(LoginActivity.this, CustomersActivity.class);


            startActivity(i);
        }
    }

}