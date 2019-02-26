package com.example.structures;

import java.util.LinkedList;

public class Stack {

    private LinkedList listStack;


    // constructor
    public Stack() {
        listStack = new LinkedList();
    }

    // push a new object on to the top of the stack
    public void push(Object o) {
        listStack.add(o);
    }

    // pop an object from the top of the stack
    public Object pop() {
        return listStack.remove();
    }

    // clear the stack
    public void clear() {
        listStack.clear();
    }

    // get the size of the stack
    public int size() {
        return listStack.size();
    }

    // get the raw LinkedList representation
    public LinkedList getRawList() {
        return listStack;
    }
}
