package com.omerkagandanaci.projecttrial3.View.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.omerkagandanaci.projecttrial3.R;

public class SignUpActivity extends AppCompatActivity {

    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editText = findViewById(R.id.editTextPassBirthDate);
        checkBox = findViewById(R.id.checkBoxTC);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    editText.setHint("Passport No");
                }
                else{
                    editText.setHint("TC ID No");
                }
            }
        });
    }
}