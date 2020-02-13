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
        People.Address addressku = new People.Address("Rumah", "Griya Ciledug", "Tangerang");
        People peopleku = new People("Rohman", 18, "gmail@rohman.com", addressku);
        String jsonku = gsonku.toJson(peopleku);

        /*String jsonku = "{\"people_age\":18,\"people_mail\":\"gmail@rohman.com\",\"people_name\":\"Rohman\"}";
        People peopleku = gsonku.fromJson(jsonku, People.class);*/
    }
}
