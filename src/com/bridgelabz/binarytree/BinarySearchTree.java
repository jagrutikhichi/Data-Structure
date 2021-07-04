package com.bridgelabz.binarytree;

public class BinarySearchTree {
	MyBinaryNode root;
	public void insertData(int data) {
		root = insert(root,data);
		}
	public MyBinaryNode insert(MyBinaryNode root, int data) {
		MyBinaryNode newNode = new MyBinaryNode();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		if (root == null) {
			root =newNode;
			return root;
		}
		if (root.data < newNode.data) {
			root.right = insert(root.right, data);
		}
		else if (root.data > newNode.data) {
			root.left = insert(root.left, data);
		}
		return root;
	}
	public int getSize() {
		return this.getSizeRecursively(root);
	}
	private int getSizeRecursively(MyBinaryNode root) {
		
		return root == null ? 0 : 1 + this.getSizeRecursively(root.left) + this.getSizeRecursively(root.right);
	}
	
	public int searchKey(int key) {
		return key = this.search(root,key);
		
	}
	
	public int search(MyBinaryNode root,int key) {
		int searchTree = 0;
		if(root == null || root.data == key) {
			return root.data;
		}
		else if (root.data < key ) {
			searchTree = search(root.right, key);
		}
		else if (root.data > key ) {
			searchTree = search(root.left, key);
		}
		
		return searchTree;
	}

}