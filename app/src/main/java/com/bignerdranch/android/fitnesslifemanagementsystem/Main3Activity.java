package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.nfc.Tag;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3Activity extends AppCompatActivity {

    Button bimpic;
    ImageView imgTakenPic;
    Button save;


    private static final int CAM_REQUEST = 1313;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bimpic = (Button) findViewById(R.id.buttonTakePicture);
        imgTakenPic = (ImageView) findViewById(R.id.imageViewPicture);
        save = (Button) findViewById(R.id.buttonSave);


        bimpic.setOnClickListener(new btnTakePhotoClicker());


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAM_REQUEST) {
            Bitmap bimpic = (Bitmap) data.getExtras().get("data");
            imgTakenPic.setImageBitmap(bimpic);

        }
    }


    class btnTakePhotoClicker implements Button.OnClickListener {
        @Override
        public void onClick(View view) {


            final RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout2);


            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, CAM_REQUEST);
        }

    }

    public void onClick(View view) {
        String FILE_NAME = "camera_photos.png";
        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File file = new File(path, FILE_NAME);

        try {
            path.mkdirs();
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                Intent i = new Intent(Main3Activity.this, LoginActivity.class);
                startActivity(i);
            case R.id.take_picture:
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);
            case R.id.HomeMenuOption:
                Intent intent3 = new Intent(Main3Activity.this, CustomersActivity.class);
                startActivity(intent3);
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}

