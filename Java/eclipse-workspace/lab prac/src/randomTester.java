// week 9 PART B library classes

import java.util.ArrayList;
import java.util.Random;

public class randomTester {
	
	// arraylist of type colour, called colours
	private ArrayList<Colour> colours;
	
	////arraylist of type string, 3 strings included
	private String[] answer = {"Yes", "No", "Maybe"};
	
	private Random rnd;

// constructor
public randomTester() {
	
	colours = new ArrayList<>();
	rnd = new Random();
	}

	// prints out one random integer
	public void printOneRandom() {
		System.out.println(rnd.nextInt());
		
	}

	// prints out TWO random (for loop) 
	public void printMultiRandom(int howMany) {
		for(int index = 0 ; index < howMany; index++) {
			System.out.println(rnd.nextInt());
		}
		
	}
	
	//random number between 1 and 6
	public void throwDice() {
		int max = 6;
		int min = 1;
		System.out.println(rnd.nextInt());
	}
	
	// randomly returns a string
	public String generateResponse() {
		int random = rnd.nextInt(answer.length);
		return answer[random];
	}
	

	

}