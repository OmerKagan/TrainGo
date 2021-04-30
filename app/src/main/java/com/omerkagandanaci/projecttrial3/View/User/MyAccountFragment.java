package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.R;
import com.omerkagandanaci.projecttrial3.View.MainActivity;

public class MyAccountFragment extends Fragment {

    Button button1, button2, button3, button4, button5;

    public MyAccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);
        button1 = view.findViewById(R.id.buttonMyInfo);
        button2 = view.findViewById(R.id.buttonMyPassengers);
        button3 = view.findViewById(R.id.buttonChangePassword);
        button4 = view.findViewById(R.id.buttonMyPoints);
        button5 = view.findViewById(R.id.buttonLogOut);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity().getApplicationContext(), MyInformation.class );
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity().getApplicationContext(), MyPassengers.class );
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity().getApplicationContext(), ChangePassword.class );
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity().getApplicationContext(), MyPoints.class );
                startActivity(intent4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getActivity().getApplicationContext(), MainActivity.class );
                startActivity(intent5);
            }
        });


        return view;
    }
}