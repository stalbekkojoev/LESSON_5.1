package com.example.lesson_51;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private AdapterName adapterName;
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.Recycler);
        contacts = new ArrayList<>();
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");
        contacts.add("Мой О!");


        adapterName=new AdapterName(contacts);
        recyclerView.setAdapter(adapterName);
    }
}