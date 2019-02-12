
public class TapeDeck {
	
	// default set to false
	boolean canRecord = false;
	
	// play method
	void playTape() { 
		System.out.println("tape playing");
	}
	
	// record method
	void recordTape() { 
		System.out.println("tape recording");
	}

}

// creating the object to test

class TapeDeckTestDrive {
	public static void main (String [] args) {
		
		// create a new tape deck object
		TapeDeck t = new TapeDeck();
		
		// using dot operator to call record tape method
		// using dot operator to call play tape method
		t.canRecord = true;
		t.playTape();
		
		// if record method is equal to true, record the tape
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}