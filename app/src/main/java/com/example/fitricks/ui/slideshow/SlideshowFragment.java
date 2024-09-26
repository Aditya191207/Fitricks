package com.example.fitricks.ui.slideshow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.fitricks.MainActivity4;
import com.example.fitricks.MainActivity5;
import com.example.fitricks.R;

public class SlideshowFragment extends Fragment {

    Activity slideshow;
    Activity slideshow2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        slideshow = getActivity();
        slideshow2 = getActivity();
        View root = inflater.inflate(R.layout.fragment_slideshow,container,false);
        return root;
    }

    public void onStart(){
        super.onStart();
        Button btn = (Button) slideshow.findViewById(R.id.button11);
        Button btn2 = (Button) slideshow2.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(slideshow, MainActivity4.class);
                startActivity(intent);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(slideshow2, MainActivity5.class);
                startActivity(intent);
            }
        });


    }
}