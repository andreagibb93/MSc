package com.example.testlab.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testlab.R;

public class MusicTrack {

    //question 1

    //declaration of data fields
    //command N, short cut creating constructor & getter & setter
    //alt insert (windows) or menu bar code generate
    private String trackName;
    private String artistName;
    private Double runtime;

    //constructor (must have the same method name as the class name)
    //set meaningful values
    public MusicTrack() {
        this.trackName = "default";
        this.artistName = "default";
        this.runtime = 0.0;
    }

    //second constructor, accepts 3 parameters, uses their values to initialise the fields
    public MusicTrack(String trackName, String artistName, Double runtime) {
        this.trackName = trackName;
        this.artistName = artistName;
        this.runtime = runtime;
    }

    //all getter & setter methods
    //get track
    public String getTrackName() {
        return this.trackName;
    }

    //set track
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    //get artist
    public String getArtistName() {
        return this.artistName;
    }

    //set artist
    public void getArtistName(String artistName) {
        this.artistName = artistName;
    }

    //get time
    public double getRunTime() {
        return this.runtime;
    }

    //set time
    public void setRunTime(double runTime) {
        this.runtime = runTime;
    }

    //prints the details of the music track,
    public void printDetails() {
        System.out.println(trackName);
        System.out.println(artistName);
        System.out.println(runtime);
        System.out.println("This is the information stored about this music track");
    }

}
