package com.example.structures;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    //declaration
    private LinkedList listQueue;

    // create a linked list
    public Queue() {

        listQueue = new LinkedList();
    }

    // add object to the queue
    public void enqueue(Object o) {

        listQueue.add(o);
    }

    // remove object by index position 0
    public Object dequeue() {

        return listQueue.remove(0);
    }

    // empty queue
    public void clear() {
        listQueue.clear();
    }

    public int size() {
        return listQueue.size();
    }

    //Returns the underlying list of this implementation
    public List getRawList() {
        return listQueue;
    }
}
