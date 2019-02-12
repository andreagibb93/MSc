package DotCom;

import java.util.ArrayList;

// improved dot.com class, using ArrayLists, instead of arrays
public class DotCom {
	
	// change array to ArrayList
	private ArrayList<String> locationCells; // arrayList of cell locations
	private String name; // dot.coms name
	
	//assign cell locations to parameter loc
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	// set name method (basic setter method)
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		
		// check user guess using index, to find out if it is in ArrayList
		int index = locationCells.indexOf(userInput);
		// if user guess greater than 0 or equal, remove it 
		if (index >= 0) {
			locationCells.remove(index); // delete entry
			
			// if list empty, kill
			if (locationCells.isEmpty() ) {
				result = "kill";
				System.out.println("Ouch! you sunk" + name + " : (");
			} else {
				result = "hit";
			} // close if		
		} // close outer if
		return result;
	} // close method
}// close class
