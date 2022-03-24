package com.example.photo_show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gallery_Photos2 extends AppCompatActivity implements View.OnClickListener {
    ImageView picture1, picture2, picture3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_photos2);

        picture1 = (ImageView) findViewById(R.id.image_1);
        picture2 = (ImageView) findViewById(R.id.image_2);
        picture3 = (ImageView) findViewById(R.id.image_3);

        picture1.setOnClickListener(this);
        picture2.setOnClickListener(this);
        picture3.setOnClickListener(this);

    }

    @Override
    public void onClick(View action4) {

        switch (action4.getId()) {
            case R.id.image_1:
                Intent checkout = new Intent(getApplicationContext(), AdventureCata.class);
                startActivity(checkout);
                break;

            case R.id.image_2:
                Intent see = new Intent(getApplicationContext(), AdventureCata.class);
                startActivity(see);
                break;

            case R.id.image_3:
                Intent findout = new Intent(getApplicationContext(), AdventureCata.class);
                startActivity(findout);
                break;
        }


    }
}