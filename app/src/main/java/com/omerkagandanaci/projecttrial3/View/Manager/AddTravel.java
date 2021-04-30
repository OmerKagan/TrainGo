package com.omerkagandanaci.projecttrial3.View.Manager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.omerkagandanaci.projecttrial3.Model.Train;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class AddTravel extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;
    private RecyclerView revi;
    private RecyclerViewAdapter recyclerViewAdapter;
    public void init(){
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Travel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        revi = findViewById(R.id.recyclerview);
        recyclerViewAdapter = new RecyclerViewAdapter(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_travel);
        init();
        ArrayList<Train> trains = new ArrayList<>();
        for(int i = 0;i<15;i++) {
            String[] cities = {"İstanbul","Ankara","İzmir","Adana","Adıyaman","Afyon","Ağrı","Aksaray","Amasya","Antalya","Ardahan","Artvin","Aydın","Balıkesir","Bartın"};
            ArrayList<Integer> firstTrainCoordinate = new ArrayList<>();

            firstTrainCoordinate.add(85);
            firstTrainCoordinate.add(66);
            Train train1 = new Train(cities[i], firstTrainCoordinate);
            trains.add(train1);
        }

        recyclerViewAdapter.setArrayList(trains);
        revi.setAdapter(recyclerViewAdapter);
        revi.setLayoutManager( new GridLayoutManager(this,3));
    }
}