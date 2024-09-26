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

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private TextView signup;
    private EditText email1, password1;
    private Button loginButton, signupButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email1 = findViewById(R.id.lemail);
        password1 = findViewById(R.id.lpass);
        loginButton = findViewById(R.id.mlogin);
        signup = findViewById(R.id.create);

        mAuth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(v -> loginUser());
        signup.setOnClickListener(v -> navigateToSignupActivity());
    }

    private void loginUser() {
        String email = email1.getText().toString().trim();
        String password = password1.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(MainActivity.this, "Login failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void navigateToSignupActivity() {
        Intent intent = new Intent(MainActivity.this, signup.class);
        startActivity(intent);
    }
}