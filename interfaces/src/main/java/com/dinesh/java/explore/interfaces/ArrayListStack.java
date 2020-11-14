package com.dinesh.java.explore.interfaces;

import java.util.ArrayList;

public class ArrayListStack implements Stack {

    private ArrayList<Integer> dataList;
    private int  pointer;
    private int size;

    public ArrayListStack(int size) {
        this.size = size;
        dataList = new ArrayList<>(size);
        pointer = -1;
    }

    @Override
    public int pop() throws StackException {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            throw new StackException("Stack  is  empty");
        }
        int topElement = dataList.get(pointer);
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
        dataList.add(element);
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1 ? true :  false;
    }

    @Override
    public boolean isFull() {
        return pointer == size - 1? true : false;
    }
}
