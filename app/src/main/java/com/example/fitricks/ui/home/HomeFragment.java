package com.example.fitricks.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.fitricks.MainActivity10;
import com.example.fitricks.MainActivity3;
import com.example.fitricks.MainActivity6;
import com.example.fitricks.MainActivity7;
import com.example.fitricks.MainActivity8;
import com.example.fitricks.MainActivity9;
import com.example.fitricks.R;

public class HomeFragment extends Fragment {
    Activity home;
    Activity home2;
    Activity home3;
    Activity home4;
    Activity home5;
    Activity home6;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        home = getActivity();
        home2 = getActivity();
        home3 = getActivity();
        home4 = getActivity();
        home5 = getActivity();
        home6 = getActivity();
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        return root;

    }
    public void onStart(){
        super.onStart();
        ImageButton btn = (ImageButton) home.findViewById(R.id.imagebutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home, MainActivity3.class);
                startActivity(intent);
            }
        });
            super.onStart();
            ImageButton btn3 = (ImageButton) home3.findViewById(R.id.imagebutton3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(home3,MainActivity7.class);
                    startActivity(intent);
                }
            });

            super.onStart();
            ImageButton btn4 = (ImageButton) home4.findViewById(R.id.imagebutton4);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(home4, MainActivity8.class);
                    startActivity(intent);
                }
            });
        super.onStart();
        ImageButton btn5 = (ImageButton) home5.findViewById(R.id.imagebutton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home5, MainActivity9.class);
                startActivity(intent);
            }
        });
        super.onStart();
        ImageButton btn6 = (ImageButton) home6.findViewById(R.id.imagebutton6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home6, MainActivity10.class);
                startActivity(intent);
            }
        });


            super.onStart();
            ImageButton btn2 =(ImageButton) home2.findViewById(R.id.imagebutton2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(home2, MainActivity6.class);
                    startActivity(intent);
                }
            });}


}