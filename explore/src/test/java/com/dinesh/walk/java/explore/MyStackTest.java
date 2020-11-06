package com.dinesh.walk.java.explore;

import org.junit.Assert;
import org.junit.Test;

import com.dinesh.walk.java.explore.stack.MyStack;

public class MyStackTest {
	
	@Test
	public void testPush() {
		 MyStack theStack = new MyStack(10); 
	     theStack.push(10);
	     long poppedElement = theStack.pop();
	     Assert.assertEquals(10, poppedElement);
	}
	
	@Test
	public void testIsEmpty(){
		MyStack theStack = new MyStack(10); 
	    Assert.assertTrue(theStack.isEmpty());
	}
	
	@Test
	public void testIsFull(){
		MyStack theStack = new MyStack(10);
		for(int i=0; i < 10; i++) {
			Assert.assertFalse(theStack.isFull());
			theStack.push(i);
		}
	    Assert.assertTrue(theStack.isFull());
	}
}
