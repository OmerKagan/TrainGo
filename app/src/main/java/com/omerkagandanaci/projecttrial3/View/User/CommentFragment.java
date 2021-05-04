package com.omerkagandanaci.projecttrial3.View.User;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.omerkagandanaci.projecttrial3.R;


public class CommentFragment extends DialogFragment {

    RatingBar ratingBar;
    Button saveComment;
    Button cancel;
    EditText comment;
    CheckBox checkBox;

    public CommentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comment, container, false);
        ratingBar = view.findViewById(R.id.ratingBar);
        saveComment = view.findViewById(R.id.saveComment);
        cancel = view.findViewById(R.id.buttonCommentCancel);
        comment = view.findViewById(R.id.shareThoughtsText);
        checkBox = view.findViewById(R.id.checkBoxAnonymous);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    //Anonymous comment
                }
                else{
                    //Comment with user name
                }
            }
        });

        saveComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Your comment has been saved", Toast.LENGTH_LONG).show();
                getDialog().dismiss();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });

        return view;
    }
}