package com.dinesh.java.explore.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListStack extends AbstractStack {

    private List<Integer> dataList;

    public MyArrayListStack(int size) {
        super(size);
        this.dataList = new ArrayList<>();
    }

    @Override
    public int pop() throws StackException {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            throw new StackException("Stack  is  empty");
        }
        int topElement = dataList.get(getPointer());
        setPointer(getPointer()-1);
        return topElement;
    }

    @Override
    public void push(int element) throws StackException {
        if(isFull()) {
            System.out.println("Stack is full");
            throw new StackException("Stack is full");
        }
        setPointer(getPointer() + 1);
        dataList.add(element);
    }


}
