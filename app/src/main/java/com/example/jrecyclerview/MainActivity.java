package com.example.jrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        fetchData();

//        recyclerView = findViewById(R.id.recyclerView);
//        KeysListAdapter adapter = new KeysListAdapter(this, items);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void fetchData() {
        for (int i = 0; i <100 ; i++) {
            items.add("items " +i);
        initKeysListAdapter();
        }
    }

    private void initKeysListAdapter() {
        recyclerView = findViewById(R.id.recyclerView);
        KeysListAdapter adapter = new KeysListAdapter(this, items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}