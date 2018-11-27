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

}