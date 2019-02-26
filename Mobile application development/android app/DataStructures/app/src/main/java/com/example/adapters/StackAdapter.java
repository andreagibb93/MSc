package com.example.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;
import com.example.structures.Stack;

public class StackAdapter extends RecyclerView.Adapter<com.example.adapters.StackAdapter.StackHolder>{
    public Stack stack;

    // StackHolder class to hold views inside the recyclerview
    public class StackHolder extends RecyclerView.ViewHolder {
        public TextView valueTxt;

        public StackHolder(View view) {
            super(view);
            valueTxt = (TextView) view.findViewById(R.id.valueTxt);
        }
    }

    // constructor
    public StackAdapter (Stack stack) {
        this.stack = stack;
    }

    // create a new view and put it in a new holder
    @Override
    public StackAdapter.StackHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.queue_list_row, parent, false);

        return new StackAdapter.StackHolder(itemView);
    }

    // set the value of the new holder
    @Override
    public void onBindViewHolder(StackAdapter.StackHolder holder, int position) {
        String value = stack.getRawList().get(position).toString();
        holder.valueTxt.setText(value);
    }

    // get the size of the stack
    @Override
    public int getItemCount() {
        return stack.size();
    }

}