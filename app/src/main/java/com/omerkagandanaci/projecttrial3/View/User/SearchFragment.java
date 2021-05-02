package com.omerkagandanaci.projecttrial3.View.User;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omerkagandanaci.projecttrial3.R;

import java.util.Calendar;

public class SearchFragment extends Fragment implements DatePickerDialog.OnDateSetListener, AdapterView.OnItemSelectedListener{

    AutoCompleteTextView from;
    AutoCompleteTextView to;
    EditText date1;
    EditText date2;
    FloatingActionButton change;
    ImageView image1;
    ImageView image2;
    RadioGroup radioGroup;
    Button buttonSearch;
    Spinner spinner;
    boolean isClickedImage1;
    boolean isClickedImage2;
    ArrayAdapter adapterCity;
    String[] cities = {"Ankara", "İstanbul", "Bursa", "Amasya", "Samsun", "Sakarya", "Sinop"};

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        isClickedImage1 = false;
        isClickedImage2 = false;
        from = view.findViewById(R.id.fromWhere);
        to = view.findViewById(R.id.toWhere);
        date1 = view.findViewById(R.id.departureDate);
        date2 = view.findViewById(R.id.returnDate);
        change = view.findViewById(R.id.changeDirection);
        buttonSearch = view.findViewById(R.id.buttonSearch);
        spinner = view.findViewById(R.id.spinnerPassengers);
        image1 = view.findViewById(R.id.dateImage1);
        image2 = view.findViewById(R.id.dateImage2);

        adapterCity = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_dropdown_item_1line, cities);
        from.setAdapter(adapterCity);
        to.setAdapter(adapterCity);

        from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                from.showDropDown();
            }
        });
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to.showDropDown();
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
                isClickedImage1 = true;
                isClickedImage2 = false;
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
                isClickedImage2 = true;
                isClickedImage1 = false;
            }
        });
        image2.setClickable(false);

        radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2) {
                    date2.setVisibility(View.VISIBLE);
                    date1.setHint("Departure Date");
                    image2.setClickable(true);
                    image2.setVisibility(View.VISIBLE);
                }
                else {
                    date2.setVisibility(View.INVISIBLE);
                    date1.setHint("Date");
                    image2.setVisibility(View.INVISIBLE);
                    image2.setClickable(false);
                }
            }
        });

        String[] passengers = {"Mahmut Furkan Gön (You)", "First Passenger", "Second Passenger", "Third Passenger"};
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter adapterPassengers = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_item, passengers);
        adapterPassengers.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterPassengers);

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

    private void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
                );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date;
        month = month + 1;
        date = dayOfMonth + "/" + month + "/" + year;
        if (isClickedImage1) {
            date1.setText(date);
        }
        else if (isClickedImage2) {
            date2.setText(date);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity().getApplicationContext(), "Selected Passengers: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}