package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.Model.Passenger;
import com.omerkagandanaci.projecttrial3.R;

public class AddPassenger extends AppCompatActivity {

    EditText name, surname, birthDate,TCIdNo;
    CheckBox checkBox;
    Button savePassenger;
    private boolean isTCCitizen;
    Passenger passenger;
    Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_passenger);
        setTitle("Add Passenger");

        name = findViewById(R.id.editTextPassName);
        surname = findViewById(R.id.editTextPassSurname);
        birthDate = findViewById(R.id.editTextPassBirthDate);
        TCIdNo = findViewById(R.id.editTextPassTCId);
        checkBox = findViewById(R.id.checkBoxTC);
        savePassenger = findViewById(R.id.savePassenger);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    TCIdNo.setHint("Passport No");
                    isTCCitizen = false;
                }
                else{
                    TCIdNo.setHint("TC ID No");
                    isTCCitizen = true;
                }
            }
        });

        savePassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passenger = addPassenger();
                customer.addAPassenger(passenger);
                Intent intent = new Intent(AddPassenger.this, UserMainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private Passenger addPassenger() {
        Passenger passenger;
        passenger = new Passenger(name.getText().toString(), surname.getText().toString(), birthDate.getText().toString(),
                TCIdNo.getText().toString(), isTCCitizen);
        return passenger;
    }
}