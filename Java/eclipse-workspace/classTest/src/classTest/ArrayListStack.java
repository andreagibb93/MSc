package classTest;

import java.util.ArrayList;

// question 9 

public class ArrayListStack implements StackADT<Object> {
	
	//declare an array list
	public ArrayList<Object> collection;
	
	// create array list in the constructor
	public ArrayListStack() {
		collection = new ArrayList<Object>();
	}
	
	
	// Inserts element to be at top of the stack.
	public void push(Object element) {
		collection.add(element);
	}
	
	//Removes and returns the top element on the stack; prints error and returns null if the stack is empty
	public Object pop() {
		if (!isEmpty()) {
			return collection.remove(collection.size() -1);
		} else {
			System.out.println("stack is empty");
			return null;
		}
	}


	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}
}