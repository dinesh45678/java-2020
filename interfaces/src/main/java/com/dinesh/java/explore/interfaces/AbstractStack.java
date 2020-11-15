package com.dinesh.java.explore.interfaces;

public abstract class AbstractStack implements Stack {

    private int pointer;
    private int  size;

    public AbstractStack(int size) {
        this.size = size;
        this.pointer = -1;
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1 ? true :  false;
    }

    @Override
    public boolean isFull() {
        return pointer == size - 1? true : false;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
