package com.example.testlab.models;
import android.util.Log;
import java.util.ArrayList;

public class MyMusicCollection {
    public static final String DEBUG_TAG = "MyMusicCollection";

    //question 2
    //declare an array list with music track objects as a data field
    public ArrayList<MusicTrack> collection;

    //constructor
    public MyMusicCollection() {
        collection = new ArrayList<>();
    }

    //get method
    //returns the value of the data field
    public ArrayList<MusicTrack> getMusicTracks() {
        return this.collection;
    }

    //add parameter to the end of the list
    public void addTrack(MusicTrack track) {
        if(this.collection.contains(track)) {
            Log.d(DEBUG_TAG, "The music collection already contains this track.");
        } else {
            collection.add(track);
            Log.d(DEBUG_TAG, "Track added to collection successfully");
        }
    }


}
