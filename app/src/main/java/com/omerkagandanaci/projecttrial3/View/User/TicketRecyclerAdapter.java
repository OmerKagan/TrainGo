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

import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class TicketRecyclerAdapter extends RecyclerView.Adapter<TicketRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Ticket> tickets;

    public TicketRecyclerAdapter(Context context, ArrayList<Ticket> tickets) {
        this.context = context;
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ticket_individual, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Ticket ticket = tickets.get(position);
        String nameOfOwner;
        nameOfOwner = ticket.getOwner().getName() + ticket.getOwner().getSurname();
        holder.owner.setText(nameOfOwner);
        holder.price.setText(ticket.getPrice() + " TL");

        if (ticket.getArrivalDate() != null) {
            holder.date.setText(ticket.getDepartmentDate() + " - " + ticket.getArrivalDate());
        }
        else {
            holder.date.setText(ticket.getDepartmentDate());
        }
        holder.from.setText("From: " + ticket.getFromWhere() + " (" + ticket.getStartTime() + ")");
        holder.to.setText("To: " + ticket.getToWhere() + " (" + ticket.getEndTime() + ")");
        holder.compartmentSeat.setText("Compartment: " + ticket.getCompartmentNo() + " - " + "Seat " + ticket.getSeat());

        boolean isExpandable;
        isExpandable = tickets.get(position).isExpandable();

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
        return tickets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView owner;
        private TextView price;
        private TextView date;
        private TextView from;
        private TextView to;
        private TextView compartmentSeat;
        private LinearLayout linearLayout;
        private RelativeLayout expandableRelativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            owner = itemView.findViewById(R.id.ownerOfTicket);
            price = itemView.findViewById(R.id.priceOfTicket);
            date = itemView.findViewById(R.id.dateText);
            from = itemView.findViewById(R.id.fromText);
            to = itemView.findViewById(R.id.toText);
            compartmentSeat = itemView.findViewById(R.id.seatText);
            linearLayout = itemView.findViewById(R.id.linearOfTicket);
            expandableRelativeLayout = itemView.findViewById(R.id.expandableRelativeOfTicket);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ticket ticket = tickets.get(getAdapterPosition());
                    ticket.setExpandable(!ticket.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
