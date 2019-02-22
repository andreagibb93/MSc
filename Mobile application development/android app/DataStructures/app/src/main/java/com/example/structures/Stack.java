package com.example.structures;

import java.util.LinkedList;

public class Stack {

    private LinkedList listStack;

    public Stack() {

        listStack = new LinkedList();
    }

    public void push(Object o) {

        listStack.add(o);
    }

    public Object pop() {

        return listStack.remove();
    }

    public void clear() {

        listStack.clear();
    }

    public int size() {
        return listStack.size();
    }

    public LinkedList getRawList() {
        return listStack;
    }
}
