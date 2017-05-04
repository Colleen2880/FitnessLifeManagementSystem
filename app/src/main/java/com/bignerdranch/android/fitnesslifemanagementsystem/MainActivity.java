package com.bignerdranch.android.fitnesslifemanagementsystem;

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

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);





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
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            case R.id.take_picture:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            case R.id.HomeMenuOption:
                Intent intent3 = new Intent(MainActivity.this, CustomersActivity.class);
                startActivity(intent3);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}

