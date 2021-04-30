package com.omerkagandanaci.projecttrial3.View.Manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.R;

public class AdminMain extends AppCompatActivity {
    Button travelSetting;
    Button addRail;
    Button viewComment;
    Button addTrain;

    public void init(){

        travelSetting = findViewById(R.id.button1);
        addRail = findViewById(R.id.button2);
        viewComment = findViewById(R.id.button3);
        addTrain = findViewById(R.id.button4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        init();
        travelSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMain.this, TravelSettings.class);
                startActivity(intent);
            }
        });

        addRail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AdminMain.this, AddDeleteRail.class);
                startActivity(intent2);
            }
        });

        viewComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(AdminMain.this, Comments.class);
                startActivity(intent3);
            }
        });
        addTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(AdminMain.this, AddTrain.class);
                startActivity(intent4);
            }
        });

    }
}