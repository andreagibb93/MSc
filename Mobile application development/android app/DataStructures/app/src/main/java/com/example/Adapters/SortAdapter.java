package com.example.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;
import com.example.structures.Queue;

import java.util.ArrayList;

public class SortAdapter extends RecyclerView.Adapter<SortAdapter.ListHolder>{
    public ArrayList list;

    public class ListHolder extends RecyclerView.ViewHolder {
        public TextView valueTxt;

        public ListHolder(View view) {
            super(view);
            valueTxt = (TextView) view.findViewById(R.id.valueTxt);
        }
    }

    public SortAdapter (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public SortAdapter.ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.queue_list_row, parent, false);

        return new SortAdapter.ListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        String value = list.get(position).toString();
        holder.valueTxt.setText(value);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
