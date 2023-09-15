package com.example.mastracapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText userNameField;
    private EditText passwordField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.button);
        userNameField = (EditText) findViewById(R.id.username);
        passwordField = (EditText) findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameField.getText().toString();
                String password = passwordField.getText().toString();

                if(userName.equals("astronomer") && password.equals("mastrac")) {
                    loginSuccess();
                } else {
                    Snackbar mySnackbar = Snackbar.make(view, "Wrong Credentials", 500);
                    mySnackbar.show();

                }
            }
        });
    }

    public void loginSuccess() {
        Intent intent = new Intent(this, WelcomePage.class);
        startActivity(intent);
    }
}