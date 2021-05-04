package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.Model.FaqModel;
import com.omerkagandanaci.projecttrial3.Model.Passenger;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class MyPassengers extends AppCompatActivity {
    ArrayList<Passenger> passengers;
    RecyclerView recyclerView;
    PassengerRecyclerAdapter adapter;
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_passengers);
        setTitle("My Passengers");

        recyclerView = findViewById(R.id.recyclerMyPassengers);
        initData();

        adapter = new PassengerRecyclerAdapter(this, passengers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

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

    private void initData() {
        passengers = new ArrayList<>();
        passengers.add(new Passenger("Kerem", "Karzaoğlu", "01/01/2001", "12345678998", true));
        passengers.add(new Passenger("Ahmet Arda", "Ceylan", "01/02/2001", "12345678997", true));
        passengers.add(new Passenger("Mustafa", "Yetgin", "01/03/2001", "12345678996", true));

    }
}