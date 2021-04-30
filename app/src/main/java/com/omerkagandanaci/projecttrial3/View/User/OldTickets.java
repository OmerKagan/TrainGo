package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;
import java.util.Date;

public class OldTickets extends AppCompatActivity {

    ListView listOfOldTickets;
    ArrayList<Ticket> oldTickets;
    ArrayAdapter<Ticket> oldAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_tickets);
        setTitle("Old Tickets");
        // Set the ListView
        listOfOldTickets = (ListView) findViewById(R.id.ListViewOldTicketList);
        oldTickets = new ArrayList<>();
        oldTickets.add(new Ticket("String fromWhere", "String toWhere", new Date(), new Date(),
                123, "String seat", new Customer("Ahmet", "279"), 67));
        oldTickets.add(new Ticket("String fromWhere", "String toWhere", new Date(), new Date(),
                123, "String seat1", new Customer("Mehmet", "984"), 73));

        oldAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, oldTickets);
        listOfOldTickets.setAdapter(oldAdapter);
    }
}