package com.bridgelabz.binarytree;

public class BinaryMain {

	public static void main(String[] args) {
		BinarySearchTree insertTree = new BinarySearchTree();
		insertTree.insertData(56);
		insertTree.insertData(30);
		insertTree.insertData(70);
		insertTree.insertData(22);
		insertTree.insertData(40);
		insertTree.insertData(11);
		insertTree.insertData(3);
		insertTree.insertData(16);
		insertTree.insertData(60);
		insertTree.insertData(95);
		insertTree.insertData(65);
		insertTree.insertData(63);
		insertTree.insertData(67);
		
		System.out.println(insertTree.searchKey(63));		
		System.out.println(insertTree.getSize());
	}

}
