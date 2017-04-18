package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CustomersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
    }


    public void onClick(View view) {


        if (view.getId() == R.id.addCustomers) {
            Intent intent = new Intent(CustomersActivity.this, AddCustomers.class);
            startActivity(intent);
        }
        ;

        if(view.getId() == R.id.buttonCustDetail) {

            Intent intent = new Intent(CustomersActivity.this, SessionActivity.class);
            startActivity(intent);
        }




    }

}



