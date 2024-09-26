package com.example.fitricks;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity {
    private TextView login;
    private EditText email2, password2;
    private Button signupButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email2 = findViewById(R.id.semail);
        password2 = findViewById(R.id.spass);
        signupButton = findViewById(R.id.signup);
        login = findViewById(R.id.loginbtn);
        mAuth = FirebaseAuth.getInstance();

        signupButton.setOnClickListener(v -> registerUser());
        login.setOnClickListener(v -> navigateToMainActivity());
    }

    private void registerUser() {
        String email = email2.getText().toString().trim();
        String password = password2.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(signup.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        // Redirect to login page
                        Intent intent = new Intent(signup.this, MainActivity2.class);
                        startActivity(intent);
                        finish(); // Close the signup activity
                    } else {
                        Toast.makeText(signup.this, "Registration failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(signup.this, MainActivity.class);
        startActivity(intent);
    }
}
