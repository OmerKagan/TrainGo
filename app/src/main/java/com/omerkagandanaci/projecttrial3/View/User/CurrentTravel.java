package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omerkagandanaci.projecttrial3.R;

public class CurrentTravel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_travel);
        setTitle("Current Travel");
    }

    public void showLiveMap(View view){
        // this part will be done later
    }

    public  void showLiveView(View view){
        // this part will be done later(Hopefully!)
    }

}