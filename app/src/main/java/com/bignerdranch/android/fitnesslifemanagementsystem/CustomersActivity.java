package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CustomersActivity extends AppCompatActivity {

    EditText editTextCustomername;

    TextView textViewcustomerlist;

    SQLiteHelper dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextCustomername = (EditText) findViewById(R.id.editTextCustomername);

        dbHandler = new SQLiteHelper(this, null, null, 1);
        printDatabase();
    }

    public void addButtonClicked() {

        Customers customer = new Customers(editTextCustomername.getText().toString());

        dbHandler.addCustomer(customer);
        printDatabase();

    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        textViewcustomerlist.setText(dbString);
        editTextCustomername.setText("");




    }

/*

    SQLiteHelper sQLiteHelper =  new SQLiteHelper(CustomersActivity.this);


    //MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);



    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            String name = data.getStringExtra(Constants.NAME);


            Customers customers = new Customers();
            customers.setName(name);


            if (requestCode == Constants.ADD_RECORD) {
                sQLiteHelper.insertRecord(customers);
            }


        }


    }


*/



/*
    public void printDatabase(){
        String dbString = dbHandler.dbToString();


    }
*/

   public void onClick(View view) {
        int id = view.getId();



        if(id == R.id.addSessions){
            Intent intent = new Intent(CustomersActivity.this, SessionActivity.class);
            startActivity(intent);
        }

        if(id == R.id.btnAddNewRecord){
            Intent intent = new Intent(CustomersActivity.this, AddCustomers.class);
            startActivity(intent);

        }


   }
/*
        if(id == R.id.buttonCustDetail) {

            Intent intent = new Intent(CustomersActivity.this, SessionActivity.class);
            startActivity(intent);
        };

*/



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






