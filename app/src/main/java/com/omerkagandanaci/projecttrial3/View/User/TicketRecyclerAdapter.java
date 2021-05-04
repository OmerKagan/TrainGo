package com.omerkagandanaci.projecttrial3.View.User;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omerkagandanaci.projecttrial3.Model.Ticket;
import com.omerkagandanaci.projecttrial3.Model.TravelUser;
import com.omerkagandanaci.projecttrial3.R;

import java.util.ArrayList;

public class TicketRecyclerAdapter extends RecyclerView.Adapter<TicketRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Ticket> tickets;
    private int type;//There are 3 different ticket display option so, we can specify by type variable
    //Types: 0 for basic ticket display, 1 for ticket with cancel option, 2 for ticket with add comment option
    //Constructor
    public TicketRecyclerAdapter(Context context, ArrayList<Ticket> tickets, int type) {
        this.context = context;
        this.tickets = tickets;
        this.type = type;
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
        private ImageView cancel;
        private ImageView addComment;

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
            cancel = itemView.findViewById(R.id.cancelTicket);
            addComment = itemView.findViewById(R.id.addComment);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ticket ticket = tickets.get(getAdapterPosition());
                    ticket.setExpandable(!ticket.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            if (type == 1) {
                addComment.setClickable(false);
                addComment.setVisibility(View.INVISIBLE);

            }

            else if (type == 2) {
                cancel.setClickable(false);
                cancel.setVisibility(View.INVISIBLE);
            }

            else {
                addComment.setClickable(false);
                addComment.setVisibility(View.INVISIBLE);
                cancel.setClickable(false);
                cancel.setVisibility(View.INVISIBLE);
            }

            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDialogMessage();
                }
            });

            addComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
    private void showDialogMessage() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Cancel");
        dialog.setMessage("Do you want to cancel this ticket?");
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
        dialog.create();
    }


}
