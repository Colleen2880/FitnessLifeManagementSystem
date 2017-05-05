package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;



public class AddCustomers extends AppCompatActivity {


    /*






    SEE MAIN ACTIVITY 3  FOR CODE FOR CAMERA













     */





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customers);

    }

    public void onClick(View view){
        int id = view.getId();

        if(id == R.id.btnDML){
            Intent intent = new Intent(AddCustomers.this, CustomersActivity.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);

        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logoff_menu:
                Intent i = new Intent(AddCustomers.this, LoginActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
