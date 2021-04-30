package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;
import java.util.Date;

public class FutureTickets extends AppCompatActivity {

    ListView listOfFutureTickets;
    ArrayList<Ticket> futureTickets;
    ArrayAdapter<Ticket> futureAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_tickets);
        setTitle("Future Tickets");
        // Set the ListView
        listOfFutureTickets = (ListView) findViewById(R.id.ListViewOldTicketList);
        futureTickets = new ArrayList<>();
        futureTickets.add(new Ticket("String fromWhere", "String toWhere", new Date(), new Date(),
                123, "String seat", new Customer("Ahmet", "279"), 67));
        futureTickets.add(new Ticket("String fromWhere", "String toWhere", new Date(), new Date(),
                123, "String seat1", new Customer("Mehmet", "984"), 73));

        futureAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, futureTickets);
        listOfFutureTickets.setAdapter(futureAdapter);

    }

    public void launchPurchasing(View v){
        // this part will be edited
        // according to the purchasing page
        /*Intent i;
        i = new Intent(this, MyTicketsFragment.PurchaseTicket.class);
        startActivity(i);*/
    }
}