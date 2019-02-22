package com.example;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.adapters.SortAdapter;

import java.util.Random;

public class SortActivity extends AppCompatActivity {

    //create a fixed size arraylist SHOULD THIS AN ARRAY INSTEAD???????
    public final int ARRAY_SIZE = 10;

    int[] randomNumbers = new int[ARRAY_SIZE];
    // generate random number
    Random rand = new Random();
    //
    SortAdapter sortAdapter = new SortAdapter(randomNumbers);
    //
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        handler = new Handler();

        // create arraylist of random numbers
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomNumbers[i] = rand.nextInt(30);
        }

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
        class Sorter implements Runnable {
            private SortAdapter sa;

            public Sorter(SortAdapter sa) {
                this.sa = sa;
            }

            public void run() {
                boolean sorted = false;

                // while list unsorted, loop though swapping each element with one next, until sorted
                while(!sorted) {
                    sorted = true;

                    for (int i = 0; i < randomNumbers.length - 1; i++) {
                        if (randomNumbers[i] > randomNumbers[i + 1]) {
                            sorted = false;

                            // hold int in a placeholder
                            int placeholder = randomNumbers[i];
                            randomNumbers[i] = randomNumbers[i + 1];
                            randomNumbers[i + 1] = placeholder;
                            try {
                                // sleep the thread so the visuals can be displayed on activity
                                Thread.sleep(500);
                            } catch (Exception e) { }

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    sa.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            }
        }

        // start new thread
        new Thread(new Sorter(sortAdapter)).start();
        // update display of recycler view (list)
        sortAdapter.notifyDataSetChanged();
    }

}
