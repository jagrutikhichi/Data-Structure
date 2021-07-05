package com.bridgelabz.stack;

public class MyStack {
	MyStackNode head;
	//Method to add data into stack
	public void push (int data) {
		MyStackNode newNode = new MyStackNode();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		
	}
	//Method to print Stack
	public void printStack() {
		MyStackNode tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode =tempNode.next;
		}
	}
	//Method to show top/peak element in stack
	public int peek() {
		return head.data;
	}
	//Method to remove data from top (LILO)
	public int pop() {
		MyStackNode tempNode = head;
		head =head.next;
		return tempNode.data;
	}

}
