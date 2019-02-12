package DotCom;
import java.util.*;

public class DotComBust {
	
	//Initialise variables we'll need
	private GameHelper helper = new GameHelper();
	// arrayList of object type dot.coms, called dotComsList
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	//variable for total guesses
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// make some dotComs, give them locations
		// give them names, add to arrayList
		DotCom one = new DotCom();
		one.setName("andis ship");
		
		DotCom two = new DotCom();
		two.setName("Kittys ship");
		
		DotCom three = new DotCom();
		three.setName("jacks ship");
		
		//add to ArrayList
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		// user instructions 
		System.out.println("Your goal is to sink three dot coms");
		System.out.println("andis ship, kittys ship, jacks ship");
		System.out.println("sink all them, in fewest number of guesses");
		
		
		for(DotCom dotComToSet : dotComsList) { // repeat for each DotCom in the list
			ArrayList<String> newLocation = helper.placeDotCom(3); // helper for a DotCom location 
			dotComToSet.setLocationCells(newLocation); // setter method, give it location, just got from helper
		} // close for loop
		
	} // close setUpGame method
	
	private void startPlaying() {
		// as long as the list is NOT empty
		while(!dotComsList.isEmpty()) {
			// get user input
			String userGuess = helper.getUserInput("enter a guess"); 
			// call our own checkUserGuess method
			checkUserGuess(userGuess); 
		}// close while
		finishGame(); // call our own method
	}// close startPlaying method
	
	private void checkUserGuess(String userGuess) {
		
		// increment the number of guesses user had made
		numOfGuesses++;
		//assume its a miss, unless told otherwise
		String result = "miss";
		
		//repeat for all DotComs in the list
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess); // ask DotCom to check user guess
			if (result.equals("hit")) { 
				break; // get of loop, no point testing others
			}
			// ship sank, take dotCom out of list and break
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		} // close for
		System.out.println(result);	
	} // close method
	
	// print the result for how the user did in the game
	private void finishGame() {
		System.out.println("All ships are dead! Your stock is now worthless");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses");
			System.out.println("You got out before your options sank");
			
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses");
			System.out.println("Fish are dancing with your options");
		}
	}// close method
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust(); // create the game object
		game.setUpGame(); // tell game object to set up
		game.startPlaying(); // tell game object to start playing
	}// close method
}
