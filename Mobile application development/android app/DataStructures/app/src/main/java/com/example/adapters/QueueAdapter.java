package com.example.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;
import com.example.structures.Queue;

public class QueueAdapter extends RecyclerView.Adapter<QueueAdapter.QueueHolder> {
    public Queue queue;

    // QueueHolder class to hold views inside the recyclerview
    public class QueueHolder extends RecyclerView.ViewHolder {
        public TextView valueTxt;

        public QueueHolder(View view) {
            super(view);
            valueTxt = (TextView) view.findViewById(R.id.valueTxt);
        }
    }

    // constructor
    public QueueAdapter (Queue queue) {
        this.queue = queue;
    }

    // create a new view and put in a new holder
    @Override
    public QueueHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.queue_list_row, parent, false);

        return new QueueHolder(itemView);
    }

    // set the value of the new view
    @Override
    public void onBindViewHolder(QueueHolder holder, int position) {
        String value = (String) queue.getRawList().get(position);
        holder.valueTxt.setText(value);
    }

    // return the size of the queue
    @Override
    public int getItemCount() {
        return queue.size();
    }

}
