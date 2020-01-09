package com.example.alexr.wiredbraincoffeeco;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    ImageView landingLogo = findViewById(R.id.image_logo);


    //Picasso.get().load("http:www.alexwolfps.com/images.logo.png").into(landinglogo);


    public void getStarted(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
