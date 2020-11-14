package com.dinesh.java.explore.interfaces;

public interface Stack {

    int pop() throws StackException;

    void push(int element) throws StackException;

    boolean isEmpty();

    boolean isFull();
}
