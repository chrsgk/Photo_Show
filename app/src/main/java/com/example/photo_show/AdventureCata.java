package com.example.photo_show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdventureCata extends AppCompatActivity implements View.OnClickListener {

    Button boat_Ride, kayak, trekking, fishing, trails, adventure, swimming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_cata);

        boat_Ride = findViewById(R.id.advBtn1);
        kayak = findViewById(R.id.advBtn2);
        trekking = findViewById(R.id.advBtn3);
        fishing = findViewById(R.id.advBtn4);
        trails = findViewById(R.id.advBtn5);
        adventure = findViewById(R.id.advBtn6);
        swimming = findViewById(R.id.advBtn7);

        boat_Ride.setOnClickListener(this);
        kayak.setOnClickListener(this);
        trekking.setOnClickListener(this);
        fishing.setOnClickListener(this);
        trails.setOnClickListener(this);
        adventure.setOnClickListener(this);
        swimming.setOnClickListener(this);
    }

    @Override
    public void onClick(View cool) {

        switch (cool.getId()){

        case R.id.advBtn1:
        Intent boat = new Intent(Intent.ACTION_VIEW, Uri.parse("https://excursionsbarcelona.com/sailing-barcelona/"));
        startActivity(boat);
        break;

        case R.id.advBtn2:
        Intent kayak = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.guiarepsol.com/es/viajar/vamos-de-excursion/rutas-en-kayak-por-cataluna/"));
        startActivity(kayak);
        break;

        case R.id.advBtn3:
        Intent trekking = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.catalantrails.com/es/"));
        startActivity(trekking);
        break;

        case R.id.advBtn4:
        Intent fish = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.greenflakefishing.com/pirineo-catalan"));
        startActivity(fish);
        break;

        case R.id.advBtn5:
        Intent trail = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cataloniaadventures.com/"));
    }

    }
}