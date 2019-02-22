package com.example.quickapplauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // check the intent has extra info
        if (getIntent().hasExtra("com.example.quickapplauncher.SOMETHING" )) {
            TextView tv = (TextView) findViewById(R.id.textView);
            // text holds a reference to the value of the key below, which is 'hello world'
            String text = getIntent().getExtras().getString("com.example.quickapplauncher.SOMETHING");
            // set the value of 'tv' to text ^ puts the text in the textview
            tv.setText(text);
        }


    }
}
