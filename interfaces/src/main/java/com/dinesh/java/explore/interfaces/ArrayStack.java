package com.dinesh.java.explore.interfaces;

public class ArrayStack implements Stack {

    private int[] data;
    private int pointer;
    private int  size;

    public ArrayStack(int size) {
        pointer = -1;
        this.size = size;
        data = new int[size];
        System.out.println("ArrayStack created");
    }

    @Override
    public int pop() throws StackException{
        if(isEmpty()) {
            System.out.println("Stack is empty");
            throw new StackException("Stack  is  empty");
        }
        int topElement = data[pointer];
        pointer = pointer - 1;
        return topElement;
    }

    @Override
    public void push(int element) throws StackException {
        if(isFull()) {
            System.out.println("Stack is full");
            throw new StackException("Stack is full");
        }
        pointer = pointer + 1;
        data[pointer] = element;
    }

    @Override
    public boolean isEmpty() {
        return  pointer ==  -1 ? true : false;
    }

    @Override
    public boolean isFull() {
        return pointer == size-1 ? true : false;
    }
}
