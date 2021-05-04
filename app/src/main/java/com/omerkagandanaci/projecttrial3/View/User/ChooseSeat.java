package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.omerkagandanaci.projecttrial3.Model.Seat;
import com.omerkagandanaci.projecttrial3.R;
import com.omerkagandanaci.projecttrial3.View.Manager.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChooseSeat extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Button button;
    ArrayList<Seat> seats;
    RecyclerView recyclerView;
    SeatRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_seat);

        spinner = findViewById(R.id.spinnerCompartment);

        String[] compartments = {"Compartment: 1", "Compartment: 2", "Compartment: 3", "Compartment: 4", "Compartment: 5"};
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter adapterCompartment = new ArrayAdapter(this, android.R.layout.simple_spinner_item, compartments);
        adapterCompartment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterCompartment);


        recyclerView = findViewById(R.id.recyclerSeat);

        seats = new ArrayList<>();
        seats.add(new Seat("1A", true));
        seats.add(new Seat("1B", true));
        seats.add(new Seat("1C", false));
        seats.add(new Seat("1D", false));
        seats.add(new Seat("2A", true));
        seats.add(new Seat("2B",true));
        seats.add(new Seat("2C", true));
        seats.add(new Seat("2D", true));

        adapter = new SeatRecyclerAdapter(this, seats);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(adapter);

        button = findViewById(R.id.buttonContinue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseSeat.this, Payment.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Selected Compartment : " + (position + 1), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}