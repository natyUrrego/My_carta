package com.example.mycarta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class EntradasActivity extends AppCompatActivity {

    String [] entradas = new String []{ "sopas","Empanadas","Patacones","Chicharrones"};
    private ListView lv =null;
    private ListAdapter la= null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        lv = findViewById( android.R.id.list);
        la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, entradas);
        lv.setAdapter(la);
    }
}