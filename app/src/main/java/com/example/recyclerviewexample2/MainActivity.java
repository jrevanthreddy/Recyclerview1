package com.example.recyclerviewexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexample2.adapter.MyCustomAdapter;
import com.example.recyclerviewexample2.model.WhatsApp;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<WhatsApp> whatsAppList;

    RecyclerView recyclerView;
    MyCustomAdapter myCustomAdapter;
    WhatsApp whatsApp1, whatsApp2,whatsApp3,whatsApp4,whatsApp5,whatsApp6,whatsApp7,whatsApp8,whatsApp9,whatsApp10,whatsApp11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        whatsAppList = new ArrayList<>();
        whatsApp1 = new WhatsApp("J.Revanth Reddy", "Hi buddy",R.drawable.revanth1);
        whatsApp2 = new WhatsApp("B.mallikarjun", "Hi mallikarjun",R.drawable.mallikarjun);
        whatsApp3 = new WhatsApp("K.Vishnu", "Hi buddy",R.drawable.vishnu);
        whatsApp4 = new WhatsApp("Narendra modi", "Hi modi",R.drawable.narendramodi);
        whatsApp5 = new WhatsApp("Donald Trump", "Hi trump",R.drawable.donaldtrump);
        whatsApp6 = new WhatsApp("Kim Jong Un", "Hi kim",R.drawable.kim);
        whatsApp7 = new WhatsApp("Jr.N.T.R", "Hi bro",R.drawable.jrntr);
        whatsApp8 = new WhatsApp("Prabhas", "Hi darling",R.drawable.prabhas);
        whatsApp9= new WhatsApp("Vin Diesel", "Hi Dom",R.drawable.vin);
        whatsApp10 = new WhatsApp("Robert Downey ", "Hi ironman",R.drawable.ironman);
        whatsApp11= new WhatsApp("Groot", "Hi groot",R.drawable.groot);

        whatsAppList.add(whatsApp1);
        whatsAppList.add(whatsApp2);
        whatsAppList.add(whatsApp3);
        whatsAppList.add(whatsApp4);
        whatsAppList.add(whatsApp5);
        whatsAppList.add(whatsApp6);
        whatsAppList.add(whatsApp7);
        whatsAppList.add(whatsApp8);
        whatsAppList.add(whatsApp9);
        whatsAppList.add(whatsApp10);
        whatsAppList.add(whatsApp11);

        myCustomAdapter = new MyCustomAdapter(whatsAppList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);
    }
}