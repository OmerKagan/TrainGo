package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.Passenger;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class PassengerRecyclerAdapter extends RecyclerView.Adapter<PassengerRecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Passenger> passengers;

    public PassengerRecyclerAdapter(Context context, ArrayList<Passenger> passengers) {
        this.context = context;
        this.passengers = passengers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.passenger_individual, parent, false);
        return new PassengerRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Passenger passenger = passengers.get(position);

        holder.setPassengerData(passenger, position);

        boolean isExpandable;
        isExpandable = passengers.get(position).isExpandable();

        if (isExpandable) {
            holder.expandableRelativeLayout.setVisibility(View.VISIBLE);
            holder.expandableRelativeLayout.setBackgroundColor(Color.rgb(234, 188, 255));
            holder.linearLayout.setBackgroundColor(Color.rgb(79, 238, 133));
        }
        else {
            holder.expandableRelativeLayout.setVisibility(View.GONE);
        }
    }

    public void deleteItem(int position) {
        passengers.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, passengers.size());
    }

    @Override
    public int getItemCount() {
        return passengers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nameSurname;
        private TextView birthDate;
        private TextView TCIdNo;
        private ImageView delete;
        private LinearLayout linearLayout;
        private RelativeLayout expandableRelativeLayout;
        private int clickedItemPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameSurname = itemView.findViewById(R.id.nameOfPassenger);
            birthDate = itemView.findViewById(R.id.birthDateOfPassenger);
            TCIdNo = itemView.findViewById(R.id.TCIdOfPassenger);
            delete = itemView.findViewById(R.id.deletePassenger);
            linearLayout = itemView.findViewById(R.id.linearOfPassenger);
            expandableRelativeLayout = itemView.findViewById(R.id.expandableRelativeOfPassenger);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Passenger passenger = passengers.get(getAdapterPosition());
                    passenger.setExpandable(!passenger.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteItem(clickedItemPosition);
                }
            });

        }

        public void setPassengerData(Passenger passenger, int position) {
            nameSurname.setText(passenger.getName() + " " + passenger.getSurname());
            birthDate.setText("Birth Date: " + passenger.getBirthDate());
            if (passenger.isTcCitizen()) {
                TCIdNo.setText("TC Id No: " + passenger.getPassportOrTCNo());
            }
            else {
                TCIdNo.setText("Passport No:  " + passenger.getPassportOrTCNo());
            }
            clickedItemPosition = position;
        }
    }
}
