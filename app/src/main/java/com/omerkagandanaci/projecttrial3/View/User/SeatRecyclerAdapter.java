package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.Seat;
import com.omerkagandanaci.projecttrial3.R;
import com.omerkagandanaci.projecttrial3.View.Manager.RecyclerViewAdapter;

import java.util.ArrayList;

public class SeatRecyclerAdapter extends RecyclerView.Adapter<SeatRecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Seat> seats;

    public SeatRecyclerAdapter(Context context, ArrayList<Seat> list) {
        this.context = context;
        seats = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seat_individual,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.seatNo.setText(seats.get(position).getSeatNo());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.relativeLayout.setBackgroundColor(Color.RED);
            }
        });

    }

    @Override
    public int getItemCount() {
        return seats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView seatNo;
        private ImageView seatImage;
        private RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            seatNo = itemView.findViewById(R.id.textView15);
            seatImage = itemView.findViewById(R.id.imageView8);
            relativeLayout = itemView.findViewById(R.id.relativeLayoutofSeat);
        }
    }

}



