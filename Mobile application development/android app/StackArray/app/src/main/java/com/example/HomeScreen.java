package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

    }

    // stack button leads to stack pages
    public void goToStack(View view) {
        Intent intent = new Intent(this, StackActivity.class);
        startActivity(intent);
    }

    // bubble sort button leads to sort bubble page
    public void goToSort(View view) {
        Intent intent = new Intent(this, SortActivity.class);
        startActivity(intent);
    }

    //queue button leads to sort queue stack page
    public void goToQueue(View view) {
        Intent intent = new Intent(this, QueueActivity.class);
        startActivity(intent);

    }
}
