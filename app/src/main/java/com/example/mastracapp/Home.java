package com.example.mastracapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mastracapp.databinding.ActivityMainBinding;

public class Home extends AppCompatActivity {

    ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bind = ActivityMainBinding.inflate(getLayoutInflater());



        
    }
}