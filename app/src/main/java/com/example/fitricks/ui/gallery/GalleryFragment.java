package com.example.fitricks.ui.gallery;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fitricks.R;

public class GalleryFragment extends Fragment {

    private EditText etHeight, etWeight;
    private Button btnCalculate;
    private TextView tvResult, tvCategory;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etHeight = view.findViewById(R.id.etHeight);
        etWeight = view.findViewById(R.id.etWeight);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        tvResult = view.findViewById(R.id.tvResult);
        tvCategory = view.findViewById(R.id.tvCategory);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        return view;
    }

    private void calculateBMI() {
        String heightStr = etHeight.getText().toString();
        String weightStr = etWeight.getText().toString();

        if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
            float height = Float.parseFloat(heightStr) / 100;
            float weight = Float.parseFloat(weightStr);

            float bmi = weight / (height * height);
            tvResult.setText("Your BMI: " + String.format("%.2f", bmi));

            if (bmi < 18.5) {
                tvCategory.setText("Underweight");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                tvCategory.setText("Normal weight");
            } else if (bmi >= 25 && bmi < 29.9) {
                tvCategory.setText("Overweight");
            } else {
                tvCategory.setText("Obesity");
            }
        } else {
            tvResult.setText("Please enter height and weight");
            tvCategory.setText("");
        }
    }
}
