package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.omerkagandanaci.projecttrial3.Model.FaqModel;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class Faq extends AppCompatActivity {

    ArrayList<FaqModel> faqs;
    RecyclerView recyclerView;
    FaqRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        setTitle("FAQ");

        recyclerView = findViewById(R.id.recyclerFaq);
        initData();

        adapter = new FaqRecyclerAdapter(this, faqs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        faqs = new ArrayList<>();
        faqs.add(new FaqModel("Who can benefit from the discounted ticket option?",
                "Every person younger than 12 or over 65 can benefit from the discounted ticket."));
        faqs.add(new FaqModel("Question 2", "Answer 2"));
        faqs.add(new FaqModel("Question 3", "Answer 3"));
        faqs.add(new FaqModel("Question 4", "Answer 4"));
        faqs.add(new FaqModel("Question 5", "Answer 5"));
        faqs.add(new FaqModel("Question 6", "Answer 6"));
        faqs.add(new FaqModel("Question 7", "Answer 7"));

    }
}