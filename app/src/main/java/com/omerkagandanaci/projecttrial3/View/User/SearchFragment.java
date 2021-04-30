package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omerkagandanaci.projecttrial3.R;

public class SearchFragment extends Fragment {

    EditText from;
    EditText to;
    EditText date1;
    EditText date2;
    FloatingActionButton change;
    RadioGroup radioGroup;
    Button buttonSearch;

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        from = view.findViewById(R.id.fromWhere);
        to = view.findViewById(R.id.toWhere);
        date1 = view.findViewById(R.id.departureDate);
        date2 = view.findViewById(R.id.returnDate);
        change = view.findViewById(R.id.changeDirection);
        buttonSearch = view.findViewById(R.id.buttonSearch);

        radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2) {
                    date2.setVisibility(View.VISIBLE);
                    date1.setHint("Departure Date");
                }
                else {
                    date2.setVisibility(View.INVISIBLE);
                    date1.setHint("Date");
                }
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromText;
                fromText = from.getText().toString();
                from.setText(to.getText().toString());
                to.setText(fromText);
            }
        });

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ListTravels.class );
                startActivity(intent);
            }
        });

        return view;
    }
}