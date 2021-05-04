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
import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class FaqRecyclerAdapter extends RecyclerView.Adapter<FaqRecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FaqModel> faqs;

    public FaqRecyclerAdapter(Context context, ArrayList<FaqModel> faqs) {
        this.context = context;
        this.faqs = faqs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq_individual, parent, false);
        return new FaqRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FaqModel faq = faqs.get(position);
        holder.question.setText(faq.getQuestion());
        holder.answer.setText(faq.getAnswer());

        boolean isExpandable;
        isExpandable = faqs.get(position).isExpandable();

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
        return faqs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView question;
        private TextView answer;
        private LinearLayout linearLayout;
        private RelativeLayout expandableRelativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question = itemView.findViewById(R.id.questionOfFaq);
            answer = itemView.findViewById(R.id.answerOfFaq);
            linearLayout = itemView.findViewById(R.id.linearOfFaq);
            expandableRelativeLayout = itemView.findViewById(R.id.expandableRelativeOfFaq);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FaqModel faq = faqs.get(getAdapterPosition());
                    faq.setExpandable(!faq.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
