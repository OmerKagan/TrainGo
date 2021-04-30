package com.omerkagandanaci.projecttrial3.View.Manager;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.Train;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context ctx;
    private ArrayList<Train> arrayList;

    public RecyclerViewAdapter(Context context){

        ctx = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.train_individual,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.trainNo.setText(((Integer)(arrayList.get(position).getTrainNumber())).toString());
        holder.location.setText(arrayList.get(position).getLocation());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.relativeLayout.setBackgroundColor(Color.GREEN);
                Toast.makeText(ctx,"You choose train in the "+arrayList.get(position).getLocation(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void setArrayList(ArrayList<Train> newTrains){
        arrayList = newTrains;
        notifyDataSetChanged();

    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView trainNo;
        private TextView location;
        private RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            location = itemView.findViewById(R.id.trainLocation);
            trainNo = itemView.findViewById(R.id.trainNumber);
            relativeLayout = itemView.findViewById(R.id.relativeLayoutofAvailable);
        }
    }
}
