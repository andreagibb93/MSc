import java.util.ArrayList;

public class weeknineEXTRA {

	private Object[] myArray;

	// constructor
	public weeknineEXTRA() {
		this.myArray = new Object[10];
	}
      
     // use add() method to add elements in the list
	myArray.add(1);
	myArray.add(2);
	myArray.add(3);
      
      // Trim the arraylist
	myArray.trimToSize();

      // let us print all the elements available in list
      for (Object ob : myArray) {
         System.out.println("Number = " + ob);
      }
   }

	public static void main(int[] argv) {
	}
} 