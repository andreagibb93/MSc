package simpledotCom;

public class SimpleDotComGame {
	
		public static void main (String [] args) {
			// variable to track how many guesses
			int numOfGuesses = 0;
			
			// method for getting user input
			GameHelper helper = new GameHelper();
			
			// create the dot.com object
			SimpleDotCom theDotCom = new SimpleDotCom(); 
			int randomNum = (int) (Math.random() *5); // make the random number for the first cell
			
			// cell locations array 
			int [] locations = {randomNum, randomNum+1, randomNum+2};
			theDotCom.setLocationCells(locations); // give theDotCom its locations (the array)
			boolean isAlive = true; // check is user alive
			
			//while loop to check if user is alive
			while(isAlive == true) {
				String guess = helper.getUserInput("enter a number"); // user input string
				String result = theDotCom.checkYourself(guess); // take the guess
				numOfGuesses++; // increment guess counter
				if (result.equals("kill")) // if it was a 'kill' change isAlive to false
					isAlive = false; // game over
				System.out.println("you took " + numOfGuesses + " guesses");
				// print amount of guesses, don't re-enter loop
			}
			
			
					
		}
	}
