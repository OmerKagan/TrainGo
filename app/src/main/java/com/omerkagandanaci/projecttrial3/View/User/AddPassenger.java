package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.omerkagandanaci.projecttrial3.R;

public class AddPassenger extends AppCompatActivity {

    EditText TCIdNo;
    CheckBox checkBox;
    Button savePassenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_passenger);

        TCIdNo = findViewById(R.id.editTextPassTCId);
        checkBox = findViewById(R.id.checkBoxTC);
        savePassenger = findViewById(R.id.savePassenger);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    TCIdNo.setHint("Passport No");
                }
                else{
                    TCIdNo.setHint("TC ID No");
                }
            }
        });

        savePassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPassenger.this, UserMainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}