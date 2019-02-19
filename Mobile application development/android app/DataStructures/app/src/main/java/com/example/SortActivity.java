package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.Adapters.SortAdapter;
import com.example.structures.Sort;

import java.util.ArrayList;
import java.util.Random;

public class SortActivity extends AppCompatActivity {
    public final int ARRAYLIST_SIZE = 10;

    // declaration
    ArrayList<Integer> randomNumbers = new ArrayList<>();
    Random rand = new Random();
    SortAdapter sortAdapter = new SortAdapter(randomNumbers);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        for (int i = 0; i < ARRAYLIST_SIZE; i++) {
            randomNumbers.add(rand.nextInt(20));
        }

        RecyclerView rv = (RecyclerView) findViewById(R.id.arraylistView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setAdapter(sortAdapter);
        sortAdapter.notifyDataSetChanged();
    }

    //onClick function that 'sorts'
    public void sort(View view) {
        randomNumbers = Sort.bubbleSortArrayList(randomNumbers);
        sortAdapter.notifyDataSetChanged();
    }

    // time delay on each sort

    // set up new thread, one thats constant, so that your UI doesnt freeze, one thats for 'sleep' time delay on animation

}
