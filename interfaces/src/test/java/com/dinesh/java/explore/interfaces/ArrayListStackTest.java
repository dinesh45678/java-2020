package com.dinesh.java.explore.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListStackTest {

    @Test
    public void testPop() throws StackException {
        Stack stack = new ArrayListStack(10);
        stack.push(10);
        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testIsFull() throws StackException {
        Stack stack = new ArrayListStack(10);
        for(int i=0; i < 10; i++) {
            Assert.assertFalse(stack.isFull());
            stack.push(i*10);
        }
        Assert.assertTrue(stack.isFull());

    }
}
