package classTest;

import java.util.ArrayList;

// question 5 
//
public class MyMusicCollection {
	
	// declare an array list of music track objects
	public ArrayList<MusicTrack> collection;
	
	//create array list in a constructor
	public MyMusicCollection() {
		collection = new ArrayList<MusicTrack>();
	}

	//get the value of the data field
	public ArrayList<MusicTrack> getMusicTracks() {
		return this.collection;
	}
	
	// if statement
	public void checkTrack(MusicTrack track) {
		if(this.collection.contains(track)) {
			System.out.println("This track is already in your collection");
		} else {
			collection.add(track);
			System.out.println("Track added successfully to your collection!");
		}
	}
	
	// question 6
	// check if the list is empty
	
	public boolean checkEmpty() {
		if(collection.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// another way to write the previous method
	public boolean checkEmptyAgain() {
		return collection.size() == 0;
	}
	
	// question 7 
	// for each loop to print all details of all objects in the list
	public void printDetails() {
		// Music track is the object type
		// for each element in music track assign it 'track'
		//go through collect loop
		for(MusicTrack track: collection) {
			track.printDetails();
		}
	}
	
	// question 8
	// while loop to print all details of all objects in the list
	public void printMoreDetails() {
		int i = 0;
		while(i < collection.size()) {
			collection.get(i).printDetails();
			i++;
		}
	}
		
	
	
}
