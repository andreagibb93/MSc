package com.example.sorter;

import android.os.Handler;

import com.example.adapters.SortAdapter;


public class Sorter extends Thread {
    private SortAdapter sa;
    private int[] randomNumbers;
    private Handler handler;

    // constructor
    public Sorter(SortAdapter sa, int[] randomNumbers, Handler handler) {
        this.sa = sa;
        this.randomNumbers = randomNumbers;
        this.handler = handler;
    }

    // run method to sort the list
    public void run() {
        boolean sorted = false;

        // while list unsorted, loop though swapping each element with the next one if bigger, until sotted
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

                    // post that the array has changed back to the gui
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
