package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.omerkagandanaci.projecttrial3.Model.HowToUseModel;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class HowToUse extends AppCompatActivity {

    ArrayList<HowToUseModel> howToUses;
    RecyclerView recyclerView;
    HowToUseRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        setTitle("How To Use");

        recyclerView = findViewById(R.id.recyclerHowToUse);
        initData();

        adapter = new HowToUseRecyclerAdapter(this, howToUses);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        howToUses = new ArrayList<>();
        howToUses.add(new HowToUseModel("How to sign up", ">In login page click the 'New user?' " +
                ">Enter necessary information " +
                ">Click the sign up button"));
        howToUses.add(new HowToUseModel("Title 2", "Content 2"));
        howToUses.add(new HowToUseModel("Title 3", "Content 3"));
        howToUses.add(new HowToUseModel("Title 4", "Content 4"));
        howToUses.add(new HowToUseModel("Title 5", "Content 5"));

    }
}