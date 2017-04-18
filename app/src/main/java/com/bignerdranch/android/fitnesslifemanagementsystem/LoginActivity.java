package com.bignerdranch.android.fitnesslifemanagementsystem;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;





public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




    }

    public void onClick(View v){
        if(v.getId() == R.id.loginbutton){
            Intent i = new Intent(LoginActivity.this, CustomersActivity.class);



            startActivity(i);
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.settings,menu);
        menu.findItem(R.menu.settings).setIntent(
                new Intent(LoginActivity.this, LoginActivity.class));


        return true;

    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.logoff_menu){
            super.onOptionsItemSelected(item);
            startActivity(item.getIntent());
        }
        return true;
    }
*/
}
