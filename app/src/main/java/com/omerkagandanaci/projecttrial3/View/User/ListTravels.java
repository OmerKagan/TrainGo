package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class ListTravels extends AppCompatActivity {

    Button buttonChooseSeat;
    ArrayList<TravelUser> travels;
    RecyclerView recyclerView;
    TravelUserRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_travels);

        recyclerView = findViewById(R.id.recyclerTravels);

        initData();

        adapter = new TravelUserRecyclerAdapter(this, travels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        buttonChooseSeat = findViewById(R.id.buttonChoose);
        buttonChooseSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListTravels.this, ChooseSeat.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {

        travels = new ArrayList<>();
        travels.add(new TravelUser("Ankara", "Bursa","07.00", "12.00", 12));
        travels.add(new TravelUser("Ankara", "Bursa","10.00", "15.00", 9));
        travels.add(new TravelUser("Ankara", "Bursa","12.00", "17.00", 7));
        travels.add(new TravelUser("Ankara", "Bursa","14.00", "19.00", 2));
        travels.add(new TravelUser("Ankara", "Bursa","17.00", "22.00", 14));
        travels.add(new TravelUser("Ankara", "Bursa","23.30", "07.30", 18));
    }

}