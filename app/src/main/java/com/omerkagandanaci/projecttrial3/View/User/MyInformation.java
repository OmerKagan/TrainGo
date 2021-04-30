package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omerkagandanaci.projecttrial3.R;

public class MyInformation extends AppCompatActivity {

    EditText name, surname, TCId, BirthDate, email, phoneNo;
    FloatingActionButton button1, button2, button3;
    Button apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_information);

        name = findViewById(R.id.editTextName);
        surname = findViewById(R.id.editTextSurname);
        TCId = findViewById(R.id.editTextTCId);
        BirthDate = findViewById(R.id.editTextBirthDate);
        email = findViewById(R.id.editTextEmail);
        phoneNo = findViewById(R.id.editTextPhoneNo);

        button1 = findViewById(R.id.editName);
        button2 = findViewById(R.id.editSurname);
        button3 = findViewById(R.id.editPhoneNo);

        apply = findViewById(R.id.buttonApply);

        TCId.setEnabled(false);
        BirthDate.setEnabled(false);
        email.setEnabled(false);
        name.setEnabled(false);
        surname.setEnabled(false);
        phoneNo.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setEnabled(true);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                surname.setEnabled(true);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNo.setEnabled(true);
            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setEnabled(false);
                surname.setEnabled(false);
                phoneNo.setEnabled(false);
            }
        });







    }
}