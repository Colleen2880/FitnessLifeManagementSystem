package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class CustomersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
    }


    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.addCustomers) {
            Intent intent = new Intent(CustomersActivity.this, SessionActivity.class);
            startActivity(intent);
        };


        if(id == R.id.buttonCustDetail) {

            Intent intent = new Intent(CustomersActivity.this, SessionActivity.class);
            startActivity(intent);
        };




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
                Intent i = new Intent(CustomersActivity.this, LoginActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}



