package com.omerkagandanaci.projecttrial3.View.User;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import com.omerkagandanaci.projecttrial3.R;


public class CommentFragment extends Fragment {

    RatingBar ratingBar;
    Button saveComment;
    EditText comment;

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
        comment = view.findViewById(R.id.shareThoughtsText);

        return view;
    }
}