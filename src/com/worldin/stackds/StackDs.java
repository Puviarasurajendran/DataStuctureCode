package com.worldin.stackds;

public class StackDs {

	private Node top;
	private int height;

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public StackDs(int value) {
		Node newNode = new Node(value);
		this.top = newNode;
		this.height = 1;
	}

	public void printStack() {
		Node temp = top;
		for (int i = 0; i < height; i++) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
		height++;
	}

	public int pop() {

		if (height == 0) {
			return -1;
		}
		Node temp = top;
		if (height == 1) {
			height = 0;
			top = null;
			return temp.value;
		}
		top = temp.next;
		temp.next = null;
		height--;
		return temp.value;

	}

}
