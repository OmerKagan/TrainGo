package com.omerkagandanaci.projecttrial3.View.Manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omerkagandanaci.projecttrial3.R;

public class AddDeleteRail extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;

    public void init(){
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add/Delete Rail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_delete_rail);
        init();

    }
}