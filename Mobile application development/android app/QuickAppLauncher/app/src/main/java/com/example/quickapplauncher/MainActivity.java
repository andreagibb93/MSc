package com.example.quickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button for 'second activity' page
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // intent method to the next activity
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                // pass information to another activity
                startIntent.putExtra("com.example.quickapplauncher.SOMETHING", "HELLO WORLD!");

                // start the intent = move to next page on click
                startActivity(startIntent);
            }
        });

        //launch activity external page from the app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);

                // intent asks the device if there is any apps that can open this address
                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                // if device says yes
                if (goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }

            }
        });

    }
}

// NOTES 

// activity = area that displays something
// onCreate() = first method that will fire when an activity is loaded
// findViewById() = a way to locate resources in activity

// intent
// intent = an action the device should perform
// getIntent() = gets the intent that was passed to the activity
// putExtra() = passes data as a key - value pair
// getExtras().getString() = retrieved the String that was passed to the intent object
// startActivity() = used to launch another activity


