package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omerkagandanaci.projecttrial3.Model.Customer;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class MyInformation extends AppCompatActivity {

    EditText name, surname, TCId, BirthDate, email, phoneNo;
    FloatingActionButton button1, button2, button3;
    Button apply;
    Customer customer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_information);
        setTitle("My Information");

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


        customer1 = new Customer("mfg16@gmail.com", "*********", 50);

        ArrayList<String> infos;
        infos = new ArrayList<String>();

        customer1.setInformation("Mahmut Furkan", "Gön", "12345678910", "1/5/2001", "05058791245");
        infos = customer1.getInformation();

        name.setText(infos.get(0));
        surname.setText(infos.get(1));
        TCId.setText(infos.get(2));
        BirthDate.setText(infos.get(3));
        phoneNo.setText(infos.get(4));
        email.setText(customer1.getEmail());

        TCId.setEnabled(false);
        BirthDate.setEnabled(false);
        email.setEnabled(false);
        name.setEnabled(false);
        surname.setEnabled(false);
        phoneNo.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setHint("Name");
                name.setEnabled(true);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                surname.setHint("Surname");
                surname.setEnabled(true);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNo.setHint("Mobile Phone No");
                phoneNo.setEnabled(true);
            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setEnabled(false);
                surname.setEnabled(false);
                phoneNo.setEnabled(false);
                customer1.setName(name.getText().toString());
                customer1.setSurname(surname.getText().toString());
                customer1.setPhoneNo(phoneNo.getText().toString());
            }
        });









    }
}