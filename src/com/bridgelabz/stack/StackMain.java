package com.bridgelabz.stack;

public class StackMain {
	
	public static void main(String[] args) {
		MyStack newStack = new MyStack();
		newStack.push(30);
		newStack.push(50);
		newStack.push(70);
		newStack.printStack();
		int returnData = newStack.peek();
		System.out.println(returnData);
		int deleteData = newStack.pop();
		System.out.println(deleteData);
	}
	
	
}
