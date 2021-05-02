package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.R;

public class MyPassengers extends AppCompatActivity {

    TextView passenger1, passenger2, passenger3;
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_passengers);
        setTitle("My Passengers");

        passenger1 = findViewById(R.id.firstPass);
        passenger2 = findViewById(R.id.secondPass);
        passenger3 = findViewById(R.id.thirdPass);
        buttonAdd = findViewById(R.id.buttonAddPassenger);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPassengers.this, AddPassenger.class);
                startActivity(intent);
                finish();
            }
        });
    }
}