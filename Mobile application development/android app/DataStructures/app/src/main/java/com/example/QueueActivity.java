package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adapters.QueueAdapter;
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

    // adds element to the end of the queue
    public void enqueueAdd(View view) {
        //get the user input from edit text, pass as a String
        EditText toEnqueue = findViewById(R.id.inputQueue);
        String strToPush = toEnqueue.getText().toString();

        // if the user types nothing into the edit text, toast pop-up alert
        if (strToPush.equals("")) {
            Toast.makeText(this, "Please enter some text!", Toast.LENGTH_LONG).show();
        } else {
            // push string to queue
            // clear the user input from the edit text
            myQueue.enqueue(strToPush);
            toEnqueue.getText().clear();
        }

        // update display of recycler view (list)
        queueAdapter.notifyDataSetChanged();
    }

    //remove elements out of the queue by first element that went in (index 0)
    public void dequeueRemove(View view) {

        // if the queue is bigger than 0, pop string out
        if (myQueue.size() > 0) {
            String poppedString = (String) myQueue.dequeue();

            // remove string from the recycler view (list)
            TextView display = findViewById(R.id.inputQueue);
            display.setText(poppedString);

            // clears the text box after dequeue is pressed
            TextView inputQueue = findViewById(R.id.inputQueue);
            inputQueue.setText("");

        } else {
            //if nothing to remove, toast alert user
            Toast.makeText(this, "Nothing here to dequeue!", Toast.LENGTH_LONG).show();
        }

        // update display of recycler view (list)
        queueAdapter.notifyDataSetChanged();
    }
}