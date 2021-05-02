package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.Travel;
import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class TravelUserRecyclerAdapter extends RecyclerView.Adapter<TravelUserRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<TravelUser> travels;

    public TravelUserRecyclerAdapter(Context context, ArrayList<TravelUser> list) {
        this.context = context;
        travels = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_individual, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TravelUser travel = travels.get(position);
        holder.travelTime.setText(travel.getStartTime() + " - " + travel.getEndTime());
        holder.emptySeats.setText("Number of Available Seats: " + travel.getNumOfEmptySeats());

        boolean isExpandable;
        isExpandable = travels.get(position).isExpandable();

        if (isExpandable) {
            holder.expandableRelativeLayout.setVisibility(View.VISIBLE);
            holder.expandableRelativeLayout.setBackgroundColor(Color.rgb(234, 188, 255));
            holder.linearLayout.setBackgroundColor(Color.rgb(79, 238, 133));
        }
        else {
            holder.expandableRelativeLayout.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {

        return travels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView travelTime;
        private TextView emptySeats;
        private LinearLayout linearLayout;
        private RelativeLayout expandableRelativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            travelTime = itemView.findViewById(R.id.timeOfTravel);
            emptySeats = itemView.findViewById(R.id.numOfEmptySeats);
            linearLayout = itemView.findViewById(R.id.linearOfTravel);
            expandableRelativeLayout = itemView.findViewById(R.id.expandableRelativeOfTravel);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TravelUser travel = travels.get(getAdapterPosition());
                    travel.setExpandable(!travel.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
