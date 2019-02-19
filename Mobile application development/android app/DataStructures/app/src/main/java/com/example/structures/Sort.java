package com.example.structures;

import java.util.ArrayList;

public class Sort {
    public static ArrayList<Integer> bubbleSortArrayList(ArrayList<Integer> unsortedList) {
        boolean sorted = false;

        while(!sorted) {
            sorted = true;

            for (int i = 0; i < unsortedList.size() - 1; i++) {
                if (unsortedList.get(i) > unsortedList.get(i + 1)) {
                    sorted = false;

                    int placeholder = unsortedList.get(i);
                    unsortedList.set(i, unsortedList.get(i + 1));
                    unsortedList.set(i + 1, placeholder);
                }
            }
        }

        return unsortedList;
    }
}
