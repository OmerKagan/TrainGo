package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.R;

public class Payment extends AppCompatActivity {

    Button buttonBuy, buttonBuyWithPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        buttonBuy = findViewById(R.id.buttonBuy);
        buttonBuyWithPoints = findViewById(R.id.buttonBuyWithPoints);

        buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Payment.this, Confirmation.class);
                startActivity(intent1);
                finish();
            }
        });

        buttonBuyWithPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Payment.this, Confirmation.class);
                startActivity(intent2);
                finish();
            }
        });

    }
}