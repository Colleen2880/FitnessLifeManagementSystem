package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";

    DatabaseHelper mDatabaseHelper;

    private Button btnAdd, btnViewData;

    private EditText editText;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnViewData = (Button) findViewById(R.id.btnView);
        mDatabaseHelper = new DatabaseHelper(this);



        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String newEntry = editText.getText().toString();

                if (editText.length() != 0) {

                    AddData(newEntry);

                    editText.setText("");

                } else {

                    toastMessage("You must put something in the text field!");

                }



            }

        });



        btnViewData.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, ListDataActivity.class);

                startActivity(intent);

            }

        });


    }


    public void AddData(String newEntry) {

        boolean insertData = mDatabaseHelper.addData(newEntry);

        if (insertData) {

            toastMessage("Name Successfully Added!");

        } else {

            toastMessage("Opps. Something went wrong");

        }

    }


    private void toastMessage(String message){

        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }

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
                Intent i = new Intent(Main2Activity.this, LoginActivity.class);
                startActivity(i);
            case R.id.take_picture:
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            case R.id.HomeMenuOption:
                Intent intent3 = new Intent(Main2Activity.this, CustomersActivity.class);
                startActivity(intent3);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
