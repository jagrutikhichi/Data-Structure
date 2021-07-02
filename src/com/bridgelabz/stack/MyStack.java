package com.bridgelabz.stack;

public class MyStack {
	MyStackNode head;
	public void push (int data) {
		MyStackNode newNode = new MyStackNode();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		
	}
	public void printStack() {
		MyStackNode tempNode = head;
		while(tempNode != null) {
			System.out.println(tempNode.data);
			tempNode =tempNode.next;
		}
	}

}
