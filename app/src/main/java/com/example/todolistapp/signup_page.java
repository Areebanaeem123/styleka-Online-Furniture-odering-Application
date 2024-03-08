package com.example.todolistapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup_page extends AppCompatActivity {
public EditText username;
public EditText name;
public EditText lastname;
public EditText password;
public Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        username=findViewById(R.id.username);
        name=findViewById(R.id.name);
        lastname=findViewById(R.id.lastname);
        password=findViewById(R.id.password);
        signupbutton=findViewById(R.id.signupbutton);
        signupbutton.setOnClickListener(v->{
            if (username.getText().toString().equals("areebanaeem267@gmail.com") &&
                    name.getText().toString().equals("areeba") &&
                    lastname.getText().toString().equals("naeem") &&
                    password.getText().toString().equals("1234")) {
                Toast.makeText(signup_page.this, "Welcome to the app", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(signup_page.this, "You failed as a User, Tsk", Toast.LENGTH_LONG).show();
            }

        });

    }
}