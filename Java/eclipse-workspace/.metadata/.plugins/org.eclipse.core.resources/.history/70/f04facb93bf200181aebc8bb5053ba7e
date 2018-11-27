/**
 * An implementation of the StackADT inteface.
 * Insertions and deletions of elements on the stack follow the last-in first-out scheme (LIFO).
 */
public class ArrayStack<E> implements StackADT<E>
{
       private int top; //top: current top position, i.e. NOT the position of the next available empty position on the stack
       private E[] S; //the array that holds the stack elements

       /**
        * Creates a new ArrayStack with a custom capacity.
        */
       public ArrayStack(int capacity)
       {
            top = -1;
            S = (E[]) new Object[capacity]; 
            // Casting is used in the above as generic arrays cannot be created using new E[]
       }
       
       /**
        * Creates a new ArrayStack with a default capacity.
        */
       public ArrayStack()
       {
            top = -1;
            S = (E[]) new Object[10]; 
            // Casting is used in the above as generic arrays cannot be created using new E[]
       }
    
       /**
        * Inserts element to be at top of the stack; prints error if the stack is full.
        */
       public void push(E element)
       {
            if (top == S.length-1)
                System.out.println("Stack is full; cannot push!");
            else
            {
                top++;
                S[top] = element;
            }
       }
    
       /**
        * Removes and returns the top element on the stack; prints error and returns null if the stack is empty.
        */
       public E pop()
       {
            E element;
            if (isEmpty())
            {
                System.out.println("Stack is empty; cannot pop!");
                return null;
            }
            else
            {
                element = S[top];
                S[top] = null;
                top--;
                return element;
            }
       }
        
       /**
        * Returns the top element on the stack, without removing it; prints error and returns null if the stack is empty.
        */
       public E top()
       {
            if (isEmpty())
            {
                System.out.println("Stack is empty; cannot get the top!");
                return null;
            }
            else
                return S[top];
       }

       /**
        * Returns the number of elements on the stack.
        */
       public int size()
       {
            return top + 1;
       }

       /**
        * Returns true if the stack is empty (no elements on the stack); otherwise, false.
        */
       public boolean isEmpty()
       {
           if (top + 1 == 0) //condition (top == -1) also works or could call size()
                return true;
           else
                return false;
           /*
            * a more elegant approach: return top == -1;
            */
       }  
}
