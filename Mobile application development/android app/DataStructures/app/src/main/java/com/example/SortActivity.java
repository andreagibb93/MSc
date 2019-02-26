package com.example;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.adapters.SortAdapter;
import com.example.sorter.Sorter;

import java.util.Random;

public class SortActivity extends AppCompatActivity {

    //create a fixed size arrat
    public final int ARRAY_SIZE = 10;

    // declaration
    int[] randomNumbers = new int[ARRAY_SIZE];

    // generate random number
    Random rand = new Random();

    // declare a new sort adapter for the recyclerview
    SortAdapter sortAdapter = new SortAdapter(randomNumbers);

    // declare a new handler for the sorting thread
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        handler = new Handler();

        // create array of random numbers with a limit of 30
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomNumbers[i] = rand.nextInt(30);
        }

        // apply a linear layout to the recycler view and set the adapter
        RecyclerView rv = (RecyclerView) findViewById(R.id.arraylistView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setAdapter(sortAdapter);
        sortAdapter.notifyDataSetChanged();
    }

    // reset random numbers
    public void reset(View view) {
        randomNumbers = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomNumbers[i] = rand.nextInt(30);
        }

        // update display of recycler view (list)
        sortAdapter.notifyDataSetChanged();
    }

    //onClick function that 'sorts'
    public void sort(View view) {
        // start new thread
        new Sorter(sortAdapter, randomNumbers, handler).start();
        // update display of recycler view (list)
        sortAdapter.notifyDataSetChanged();
    }

}
