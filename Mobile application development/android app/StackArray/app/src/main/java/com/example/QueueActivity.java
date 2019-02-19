package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Adapters.QueueAdapter;
import com.example.structures.Queue;

public class QueueActivity extends AppCompatActivity  {

    // declaration
    Queue myQueue = new Queue();
    QueueAdapter queueAdapter = new QueueAdapter(myQueue);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setAdapter(queueAdapter);
    }

    // add element to the end of thw queue
    public void enqueueAdd(View view) {
        EditText toEnqueue = findViewById(R.id.inputQueue);
        String strToPush = toEnqueue.getText().toString();

        if (strToPush.equals("")) {
            Toast.makeText(this, "Please enter some text!", Toast.LENGTH_LONG).show();
        } else {
            myQueue.enqueue(strToPush);
            toEnqueue.getText().clear();
        }

        queueAdapter.notifyDataSetChanged();
    }

    //remove elements out of the queue by first element that went in
    public void dequeueRemove(View view) {
        if (myQueue.size() > 0) {
            String poppedString = (String) myQueue.dequeue();

            TextView display = findViewById(R.id.inputQueue);
            display.setText(poppedString);
        } else {
            Toast.makeText(this, "Nothing here to dequeue!", Toast.LENGTH_LONG).show();
        }

        queueAdapter.notifyDataSetChanged();
    }
}