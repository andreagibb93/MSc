package com.example.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;

import java.util.ArrayList;

public class SortAdapter extends RecyclerView.Adapter<SortAdapter.ListHolder>{
    public int[] array;

    // ListHolder class to hold the views in the recyclerview
    public class ListHolder extends RecyclerView.ViewHolder {
        public TextView valueTxt;

        public ListHolder(View view) {
            super(view);
            valueTxt = (TextView) view.findViewById(R.id.valueTxt);
        }
    }

    // constructor
    public SortAdapter (int[] array) {
        this.array = array;
    }

    // create a new view and put it in a new holder
    @Override
    public SortAdapter.ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.queue_list_row, parent, false);

        return new SortAdapter.ListHolder(itemView);
    }

    // set the value of the new view
    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        String value = Integer.toString(array[position]);
        holder.valueTxt.setText(value);
    }

    // get the length of the array
    @Override
    public int getItemCount() {
        return array.length;
    }

}
