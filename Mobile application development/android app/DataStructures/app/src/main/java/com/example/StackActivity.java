package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adapters.SortAdapter;
import com.example.adapters.StackAdapter;
import com.example.structures.Stack;

public class StackActivity extends AppCompatActivity {

    // declaration
    Stack myStack = new Stack();
    StackAdapter stackAdapter = new StackAdapter(myStack);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        RecyclerView rv = (RecyclerView) findViewById(R.id.display_stack);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setAdapter(stackAdapter);
        stackAdapter.notifyDataSetChanged();
    }

    // push elements to the stack
    public void pushStack(View view) {
        EditText toPush = findViewById(R.id.input);
        String strToPush = toPush.getText().toString();

        if (strToPush.equals("")) {
            //TODO: Alert
            Toast.makeText(this, "Please enter some text!", Toast.LENGTH_LONG).show();
        } else {
            myStack.push(strToPush);
            toPush.getText().clear();

            // increase count by one with each click of push button
            TextView stackCount = findViewById(R.id.stackCount);
            stackCount.setText(Integer.toString(myStack.size()));
        }

        stackAdapter.notifyDataSetChanged();
    }

    // pop elements out of the stack //
    public void popStack(View view) {
        if (myStack.size() > 0) {
            String poppedString = (String) myStack.pop();

            // decrease count by one with each click of pop button
            TextView stackCount = findViewById(R.id.stackCount);
            stackCount.setText(Integer.toString(myStack.size()));

            //clear the input box
            EditText userInput = findViewById(R.id.input);
            userInput.setText("");
        }
        else {
            // notifies the user that there is nothing to pop in the stack
            Toast.makeText(this, "Nothing here to pop!", Toast.LENGTH_LONG).show();
        }

        stackAdapter.notifyDataSetChanged();
    }

    // clear the stack
    public void clearStack(View view) {
        if (myStack.size() > 0) {
            myStack.clear();
            TextView stackCount = findViewById(R.id.stackCount);
            stackCount.setText(Integer.toString(myStack.size()));

            // reset count to 0
        }
        else {
            Toast.makeText(this, "Stack is already empty!", Toast.LENGTH_LONG).show();
        }

        stackAdapter.notifyDataSetChanged();
    }
}



