import java.util.ArrayList;

// first ArrayList, fixed size, any type
// 'Object' means it can have any type


public class weeknine {

	private Object [] myArray;

	// constructor
	public weeknine() {
		myArray = new Object[10];
	}

	// return size of array list
	public int size() {
		return myArray.length;
	}

	// add an object to the list method
	public void addMethod(Object ob) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == null) {
				myArray[i] = ob;
				return;
			}
		}
	}
	// remove an object from the list by index method
	public void removeMethod(int index) {
		myArray[index] = null;
	}
	
	// get at index
	public Object getIndex(int index) {
		return myArray[index];
	}
	
	// list all items in list
	// for each loop
	public void listAllItems() {
		for(Object ob : myArray) 
			System.out.println(ob);
		}
	}

	
}