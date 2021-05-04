package com.omerkagandanaci.projecttrial3.View.User;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.FaqModel;
import com.omerkagandanaci.projecttrial3.Model.HowToUseModel;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class HowToUseRecyclerAdapter extends RecyclerView.Adapter<HowToUseRecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<HowToUseModel> howToUses;

    public HowToUseRecyclerAdapter(Context context, ArrayList<HowToUseModel> howToUses) {
        this.context = context;
        this.howToUses = howToUses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.howtouse_individual, parent, false);
        return new HowToUseRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HowToUseModel howToUse = howToUses.get(position);

        holder.title.setText(howToUse.getTitle());
        holder.content.setText(howToUse.getContent());

        boolean isExpandable;
        isExpandable = howToUses.get(position).isExpandable();

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
        return howToUses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView content;
        private LinearLayout linearLayout;
        private RelativeLayout expandableRelativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleOfHowToUse);
            content = itemView.findViewById(R.id.contentOfHowToUse);
            linearLayout = itemView.findViewById(R.id.linearOfHowToUse);
            expandableRelativeLayout = itemView.findViewById(R.id.expandableRelativeOfHowToUse);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HowToUseModel howToUse = howToUses.get(getAdapterPosition());
                    howToUse.setExpandable(!howToUse.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
