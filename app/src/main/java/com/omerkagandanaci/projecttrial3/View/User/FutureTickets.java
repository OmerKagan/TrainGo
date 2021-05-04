package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.Model.Passenger;
import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;
import java.util.Date;

public class FutureTickets extends AppCompatActivity {

    Button addNewTicket;
    ArrayList<Ticket> futureTickets;
    RecyclerView recyclerView;
    TicketRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_tickets);
        setTitle("Future Tickets");

        recyclerView = findViewById(R.id.recyclerFutureTickets);
        initData();

        adapter = new TicketRecyclerAdapter(this, futureTickets, 1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        addNewTicket = findViewById(R.id.buttonAddNewTicket);
        addNewTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FutureTickets.this, UserMainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void initData() {
        futureTickets = new ArrayList<>();
        futureTickets.add(new Ticket("Ankara", "Bursa", "02/05/2021", "12.00", "17.00", 1, "2A",
                new Passenger("Kerem", "Karzaoğlu", "01/01/2001", "12345678998", true), 45.00));
        futureTickets.add(new Ticket("Ankara", "Bursa", "02/05/2021", "12.00", "17.00", 1, "2B",
                new Passenger("Mahmut Furkan", "Gön", "01/01/2001", "12345678998", true), 60.00));
        futureTickets.add(new Ticket("Ankara", "Bursa", "03/05/2021", "12.00", "17.00", 1, "2B",
                new Passenger("Mahmut Furkan", "Gön", "01/01/2001", "12345678998", true), 60.00));
        futureTickets.add(new Ticket("Ankara", "Bursa", "04/05/2021", "12.00", "17.00", 1, "2B",
                new Passenger("Mahmut Furkan", "Gön", "01/01/2001", "12345678998", true), 60.00));
        futureTickets.add(new Ticket("Ankara", "Bursa", "05/05/2021", "12.00", "17.00", 1, "2B",
                new Passenger("Mahmut Furkan", "Gön", "01/01/2001", "12345678998", true), 60.00));

    }


}