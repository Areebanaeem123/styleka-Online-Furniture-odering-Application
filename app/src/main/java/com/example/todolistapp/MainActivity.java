package com.example.todolistapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //variables declared
    public EditText editTextTextEmailAddress2;
    public EditText editTextNumberPassword;
    public Button loginbutton;
    public Button signupbutton; // Button for sign-up
    public  Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText and Button
        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2);
        editTextNumberPassword = findViewById(R.id.editTextNumberPassword);

        loginbutton = findViewById(R.id.button2); // Assuming login button ID is login_button
        signupbutton = findViewById(R.id.button3); // Assuming sign-up button ID is signup_button

        // Set click listener for login button
        loginbutton.setOnClickListener(v -> {
            if (editTextTextEmailAddress2.getText().toString().equals("user") &&
                    editTextNumberPassword.getText().toString().equals("1234")) {
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
            }
        });

        // Set click listener for sign-up button
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SignUpActivity when the user clicks "Sign Up"
                Intent userwantstosignup = new Intent(MainActivity.this, signup_page.class);
                startActivity(userwantstosignup);
            }

        });
    }
}

