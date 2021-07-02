package com.bridgelabz.queues;

public class MyQueues {

	MyQueueNode head;
	MyQueueNode tail;
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
	public int deQueue () {
		MyQueueNode tempNode = head;
		head =head.getNext();
		return tempNode.getData();
	}
}
