package com.ditto.training.belajargson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gsonku = new Gson();
        People peopleku = new People("Rohman", 18, "gmail@rohman.com");
        String jsonku = gsonku.toJson(peopleku);
    }
}
