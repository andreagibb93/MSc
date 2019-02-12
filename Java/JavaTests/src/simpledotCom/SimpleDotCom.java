package simpledotCom;
public class SimpleDotCom {
	
	// int array, called locationCells
	int[] locationCells;
	
	// int to hold the number of hits
	public int numOfHits = 0; 
	
	// setter method 
	// assign cell locations to parameter locs
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	
	// checks user guess, returns result
	public String checkYourself(String userGuess) {
		
		//convert string to int
		int guess = Integer.parseInt(userGuess);
		String result = "miss"; // default set to miss
		
		//repeat with each cell, in the cell location array
		for (int cell : locationCells) {
			if (guess == cell) { // compare user guess to cell in array
				result = "hit";
				numOfHits ++; // increment by one
				break; // get out of loop, no need to test other cells
				
			} // end if
		} // end for
		
		// check for kill, return kill if hit 3 times
		if (numOfHits == locationCells.length) {
			result = "kill";
			}
		
		// end of if
		System.out.println(result); // result for the user
		return result; // return the result back to the calling method
}
		
	
	// test code for set cell locations 
	public static void main (String [] args) {
		
		// instantiate a new object 
		SimpleDotCom dot = new SimpleDotCom();
		
		//int array for location of the dotCom, 3 consecutive ints
		int[] locations = {2,3,4};
		dot.setLocationCells(locations); // invoke the setter method 'setLocation'
		
		String userGuess = "2"; // fake user guess
		String result = dot.checkYourself(userGuess); // pass checkYourself method fake guess
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed"; //if fake guess 2 gives 'hit', its working
		}
		
		System.out.println(testResult);
		//print out passed or failed
	
	}
}









