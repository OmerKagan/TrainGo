package com.omerkagandanaci.projecttrial3.View.Manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.R;

public class TravelSettings extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;
    private Button btn;
    private Button btn2;
    public void init(){
        btn = findViewById(R.id.gotoaddtravel);
        btn2 = findViewById(R.id.gotochangetravel);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Travel Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_settings);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelSettings.this, AddTravel.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(TravelSettings.this, ChangeTravel.class);
                startActivity(intent2);
            }
        });
    }
}