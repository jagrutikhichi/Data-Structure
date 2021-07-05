package com.bridgelabz.queues;

public class MyQueues {

	MyQueueNode head;
	MyQueueNode tail;
	// Add the new node at the end of queue
	public void enQueue (int data) {
		MyQueueNode newNode = new MyQueueNode();
		newNode.setData(data);
		newNode.setNext(head);
		
		if (head == null) {
			head =newNode;
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
	}
	// Method to remove first interted element
	public int deQueue () {
		MyQueueNode tempNode = head;
		head =head.getNext();
		return tempNode.getData();
	}
}
