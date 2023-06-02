package com.example.ex8_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView picture= findViewById(R.id.ivPicture1);
        picture.setImageResource(R.drawable.images);
        picture.setContentDescription("Paris");
    }
}