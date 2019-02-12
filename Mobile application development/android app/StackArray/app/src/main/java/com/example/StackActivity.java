package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class StackActivity extends AppCompatActivity {

    // declaration
    Stack<String> myStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    //pop elements out of the stack
    public void popStack(View view) {
        if (myStack.size() > 0) {
            String poppedString = myStack.pop();

            TextView display = findViewById(R.id.display);
            display.setText(poppedString);
            Toast.makeText(this, "Nothing here to pop!", Toast.LENGTH_LONG).show();

            // decrease count by one with each click of pop button
            TextView stackCount = findViewById(R.id.stackCount);
            stackCount.setText(Integer.toString(myStack.size()));

        }
    }

    // clear the stack
    public void clearStack(View view) {
        myStack.clear();
        Toast.makeText(this, "Stack is already empty!", Toast.LENGTH_LONG).show();

        // reset count to 0
        TextView display = findViewById(R.id.display);
        display.setText("");
    }


}

