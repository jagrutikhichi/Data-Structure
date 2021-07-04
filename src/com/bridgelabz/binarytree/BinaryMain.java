package com.bridgelabz.binarytree;

public class BinaryMain {

	public static void main(String[] args) {
		BinarySearchTree searchTree = new BinarySearchTree();
		searchTree.insertData(56);
		searchTree.insertData(30);
		searchTree.insertData(70);
		searchTree.insertData(22);
		searchTree.insertData(40);
		searchTree.insertData(11);
		searchTree.insertData(3);
		searchTree.insertData(16);
		searchTree.insertData(60);
		searchTree.insertData(95);
		searchTree.insertData(65);
		searchTree.insertData(63);
		searchTree.insertData(67);
		
		System.out.println(searchTree.getSize());
	}

}
