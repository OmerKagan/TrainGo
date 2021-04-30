package com.omerkagandanaci.projecttrial3.View.Manager;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.omerkagandanaci.projecttrial3.R;
import com.omerkagandanaci.projecttrial3.View.ForgotPasswordActivity;
import com.omerkagandanaci.projecttrial3.View.User.UserMainActivity;

public class AdminFragment extends Fragment {

    TextView forgotPassword;
    Button buttonLogin;

    public AdminFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_admin, container, false);
        forgotPassword = view.findViewById(R.id.textViewForgot);
        buttonLogin = view.findViewById(R.id.buttonLogin);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity().getApplicationContext(), ForgotPasswordActivity.class );
                startActivity(intent1);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity().getApplicationContext(), AdminMain.class );
                startActivity(intent2);
            }
        });


        return view;
    }
}