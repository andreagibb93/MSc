import java.util.NoSuchElementException;
import java.util.Arrays;

public class classForTest {
	
	
	
//	    private Item[] items; // items of items
//	    private int size; // number of elements in RandomizedQueue
//
//	
//	/* Initialises an empty randomised queue */
//    public void RandomizedQueue() {
//        items = (Item[]) new Object[1];
//        size = 0;
//    }
//    /* add items to the queue*/
//    public void enqueue(Item item) {
//        if (item == null)
//            throw new NullPointerException("Null item added");
//        if (size == items.length)
//            resize(2 * items.length); // double size of array if necessary
//        items[size++] = item;
//    }
//    /*remove and return a random item from the queue*/
//    public Item dequeue() {
//        if (size == 0)
//            throw new NoSuchElementException("Randomized Queue underflow");
//        int pos = StdRandom.uniform(size);
//        Item item = items[pos];
//        items[pos] = items[--size];
//        items[size] = null;
//        // shrink size of items if necessary
//        if (size > 0 && size == items.length / 4)
//            resize(items.length / 2);
//        return item;
//    }
//    
//    /* returns but doesnt delete random item*/
//    public Item sample() {
//        if (size == 0)
//            throw new NoSuchElementException("Randomized Queue underflow");
//        int pos = StdRandom.uniform(size);
//        return items[pos];
//
//    
//    /* if the queue is empty return true */ 
//    public boolean isEmpty() {
//        return size == 0;
//    }
//    
//    /* returns the size of the items on the queue*/
//    public int size() {
//        return size;
//    }
//    
// // resize the underlying array holding the elements
//    private void resize(int capacity) {
//        assert capacity >= size;
//        Item[] temp = (Item[]) new Object[capacity];
//        for (int i = 0; i < size; i++)
//            temp[i] = items[i];
//        items = temp;
//    }
//
//}
    
}
