package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.Model.Passenger;
import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class Payment extends AppCompatActivity {

    Button buttonBuy, buttonBuyWithPoints;
    ArrayList<Ticket> tickets;
    RecyclerView recyclerView;
    TicketRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        recyclerView = findViewById(R.id.recyclerTicket);
        initData();

        adapter = new TicketRecyclerAdapter(this, tickets, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

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

    private void initData() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket("Ankara", "Bursa", "02/05/2021", "12.00", "17.00", 1, "2A",
                new Passenger("Kerem", "Karzaoğlu", "01/01/2001", "12345678998", true), 45.00));
        tickets.add(new Ticket("Ankara", "Bursa", "02/05/2021", "12.00", "17.00", 1, "2B",
                new Passenger("Mahmut Furkan", "Gön", "01/01/2001", "12345678998", true), 60.00));
    }
}