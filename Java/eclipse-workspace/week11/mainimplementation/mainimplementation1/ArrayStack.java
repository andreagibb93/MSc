import java.util.Arrays;

public class ArrayStack<E> implements StackADT<E>
{
    int top;
    E[] S;
    /**
     * Constructor for objects of class ArrayStack
     */
    public ArrayStack(int capacity)
    {
        top = -1;
        S = (E[]) new Object[capacity]; 
        // Casting is used in the above as generic arrays cannot be created using new E[]
    }
    
    public ArrayStack()
    {
        top = -1;
        S = (E[]) new Object[2]; 
        // Casting is used in the above as generic arrays cannot be created using new E[]
    }
    
    public void push(E element)
    {
    	//capacity checking
    	if (size() == S.length) {
    		//System.out.println("ArrayStack length has reached capacity!");	
    		// Consider doing it with for loop iteration to pass the elements to a new array with double the length
    		S = Arrays.copyOf(S, (S.length*2));
    	}
    	
    	else {
    	top++;
    	S[top] = element;	
    	}
    }

    public E pop()
    {
    	E temp = S[top];
    	S[top] = null;
    	top--;
    	return temp;
    }
    
    public E top()
    {
    	return S[top];
    }
    
    
    public int size()
    {
    	return top+1;
    }
    
    public boolean isEmpty()
    {
    	return top == -1;
    }
    
}