package com.example.testlab.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testlab.models.MusicTrack;
import com.example.testlab.models.MyMusicCollection;
import com.example.testlab.R;

public class MainActivity extends Activity {

    //declare
    private MyMusicCollection tracks;
    //declare list view
    private ListView myListView;
    private ArrayAdapter myArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set tracks to be a new object of type MyMusicCollection
        tracks = new MyMusicCollection();

        //store the data field objects
        myListView = (ListView) findViewById(R.id.listView);

        //array adapter, list view needs this
        myArrayAdapter = new ArrayAdapter<MusicTrack>(this, android.R.layout.simple_list_item_1, tracks.getMusicTracks()) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = view.findViewById(android.R.id.text1);
                text1.setText(tracks.getMusicTracks().get(position).getArtistName());
                return view;
            }
        };

        //set the adapter for the list view
        myListView.setAdapter(myArrayAdapter);

        //set an event listener: when the item on the list view is clicked
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), tracks.getMusicTracks().get(position).getArtistName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    //question 3
    //user can input 3 values
    //btn, when clicked music track object is created & added to the MyMusicCollection
    public void addMusicTrack(View view) {
        //takes the user input
        EditText trackNameView = findViewById(R.id.trackName);
        EditText artistNameView = findViewById(R.id.aritstName);
        EditText runtimeView = findViewById(R.id.runtime);

        //error checking, check for missing user input
        if (trackNameView.getText().length() == 0 || artistNameView.getText().length() == 0 || runtimeView.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter track details", Toast.LENGTH_SHORT).show();
            return;
        }

        //user input convert to string
        String trackName = trackNameView.getText().toString();
        String artistName = artistNameView.getText().toString();
        Double runtime;

        //error checking, invalid value for runtime
        // CHANGE this an if statement, if its empty, throw error.
        try {
            runtime = Double.parseDouble(runtimeView.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Please enter a number for runtime", Toast.LENGTH_SHORT).show();
            return;
        }

        //add music track object to my music track collection object
        MusicTrack track = new MusicTrack(trackName, artistName, runtime);
        if (tracks.getMusicTracks().contains(track)) {
            Toast.makeText(getApplicationContext(), "This track is already in your collection", Toast.LENGTH_SHORT).show();
        } else {
            tracks.addTrack(track);
            Toast.makeText(getApplicationContext(), "Track added successfully to your collection", Toast.LENGTH_SHORT).show();
        }

        //clear input box
        trackNameView.getText().clear();
        artistNameView.getText().clear();
        runtimeView.getText().clear();

        myArrayAdapter.notifyDataSetChanged();
    }

}
