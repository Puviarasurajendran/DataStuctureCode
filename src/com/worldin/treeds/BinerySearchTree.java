package com.worldin.treeds;

public class BinerySearchTree {

	Node root;

	class Node {
		 Node left;
		 Node right;
		 int value;

		public Node(int value) {
			this.value = value;
		}
	}

	public boolean insertTreeNode(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (temp.value == value) return false;
				
			if (temp.value > value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				    }
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}

	}
	
	public boolean containsTreeNode(int value) {
		Node temp=root;
		while(temp!=null) {
			if(temp.value==value) return true;
			if(temp.value>value) temp=temp.left;
			else {
				temp=temp.right;
			}
		}
		return false;
	}
}
