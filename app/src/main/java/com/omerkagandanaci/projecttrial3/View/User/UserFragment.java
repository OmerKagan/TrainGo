package com.omerkagandanaci.projecttrial3.View.User;

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

public class UserFragment extends Fragment {

    TextView forgotPassword;
    TextView newUser;
    Button buttonLogin;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        forgotPassword = view.findViewById(R.id.textViewForgot);
        newUser = view.findViewById(R.id.textViewNewUser);
        buttonLogin = view.findViewById(R.id.buttonLogin);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity().getApplicationContext(), ForgotPasswordActivity.class );
                startActivity(intent1);
            }
        });

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity().getApplicationContext(), SignUpActivity.class );
                startActivity(intent2);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity().getApplicationContext(), UserMainActivity.class );
                startActivity(intent3);
            }
        });

        return view;
    }
}