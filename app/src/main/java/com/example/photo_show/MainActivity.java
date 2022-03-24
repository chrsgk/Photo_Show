package com.example.photo_show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView image;
    Button button_1, button_2;
    Random r;
    Integer [] images = {
            R.drawable.nature_1,
            R.drawable.nature_2,
            R.drawable.beau_nature_3,
            R.drawable.beut_nature_4,
            R.drawable.garonne_nature5,
            R.drawable.llob_nature_6,
            R.drawable.llobregat_nature_7,
            R.drawable.tajo_nature_8,
    };

    int pickedImage = 1, lastPickedImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image_view);
        button_1 = (Button) findViewById(R.id.Btn_fetch);
        button_2 = (Button) findViewById(R.id.Activity_Btn);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);

    }

    @Override
    public void onClick(View action3) {
        switch (action3.getId()){
            case R.id.Btn_fetch:
                Intent checkout = new Intent(getApplicationContext(), Gallery_Photos2.class);
                startActivity(checkout);
                break;
            case R.id.Activity_Btn:
                Intent check = new Intent(getApplicationContext(), AdventureCata.class);
                startActivity(check);
                break;

        }

    }
}