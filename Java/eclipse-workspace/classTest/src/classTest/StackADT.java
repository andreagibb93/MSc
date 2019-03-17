package classTest;
public interface StackADT<Object>
{
    /**
     * Inserts element to be at top of the stack.
     */
    public void push(Object element);
	
    /**
     * Removes and returns the top element on the stack; prints error and returns null if the stack is empty.
     */
	public Object pop();
	
    /**
     * Returns the top element on the stack, without removing it; prints error and returns null if the stack is empty.
     */
   	public Object top();
	
    /**
     * Returns the number of elements on the stack.
     */
	public int size();
	
    /**
     * Returns true if the stack is empty (no elements on the stack); otherwise, false.
     */
	public boolean isEmpty();
	
    /**
     * Returns the index of the first occurrence of the specified element on the stack, or -1 if this stack does not contain the element.
     */
	public int indexOf(Object element);
}