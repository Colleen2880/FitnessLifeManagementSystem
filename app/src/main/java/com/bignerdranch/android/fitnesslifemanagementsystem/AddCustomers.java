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

    EditText editTextCustomername;

    TextView textViewcustomerlist;

    SQLiteHelper dbHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customers);

        editTextCustomername = (EditText) findViewById(R.id.editTextCustomername);

        dbHandler = new SQLiteHelper(this, null, null, 1);
        printDatabase();


    }

    private void onButtonClick(){
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
    private void onAddRecord() {
        Intent intent = new Intent(AddCustomers.this, CustomersActivity.class);
        intent.putExtra(Constants.DML_TYPE, Constants.INSERT);
        startActivityForResult(intent, Constants.ADD_RECORD);

    }

    String request = getIntent().getExtras().get(Constants.DML_TYPE).toString();

    btnDML.setText(Constants.INSERT);


    private void onButtonClick() {

        Intent intent = new Intent();
        intent.putExtra(Constants.NAME, etName.getText().toString());

        setResult(RESULT_OK, intent);
        finish();
    }


*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);

        return true;
    }

    ;

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
