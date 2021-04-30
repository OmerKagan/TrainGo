package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.omerkagandanaci.projecttrial3.R;


public class MyTicketsFragment extends Fragment {

    Button buttonCurrent, buttonOld, buttonFuture;

    public MyTicketsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_tickets, container, false);

        buttonCurrent = view.findViewById(R.id.buttonCurrentTravel);
        buttonOld = view.findViewById(R.id.buttonOldTickets);
        buttonFuture = view.findViewById(R.id.buttonFutureTickets);

        buttonCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity().getApplicationContext(), CurrentTravel.class );
                startActivity(intent1);
            }
        });

        buttonOld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity().getApplicationContext(), OldTickets.class );
                startActivity(intent2);
            }
        });

        buttonFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity().getApplicationContext(), FutureTickets.class );
                startActivity(intent3);
            }
        });

        return view;
    }



    public static class PurchaseTicket {
    }
}