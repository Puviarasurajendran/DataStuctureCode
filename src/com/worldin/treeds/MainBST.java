package com.worldin.treeds;

public class MainBST {
	
	public static void main(String[] args) {
		
		BinerySearchTree bst= new BinerySearchTree();
		bst.insertTreeNode(5);
		bst.insertTreeNode(3);
		bst.insertTreeNode(7);
		bst.insertTreeNode(8);
		bst.insertTreeNode(6);
		bst.insertTreeNode(2);
		bst.insertTreeNode(4);
		bst.insertTreeNode(1);
		bst.insertTreeNode(9);
		
		System.out.println("Answer :"+bst.containsTreeNode(0));
		
		System.out.println("Answer value :"+bst.root.right.right.right.value);
		
		System.out.println("Answer value :"+bst.root.right.right.left);
	}

}
