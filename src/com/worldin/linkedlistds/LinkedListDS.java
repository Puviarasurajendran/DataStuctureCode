package com.worldin.linkedlistds;

public class LinkedListDS {

	Node head;
	Node tail;
	int length;

	class Node {
		Node next;
		int value;

		public Node(int val) {
			this.value = val;
		}
	}

	public LinkedListDS(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}

	public boolean appendLLNode(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
		length++;
		return true;
	}

	public void prepandLLNode(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			this.head = newNode;
			this.tail = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public boolean insertListNode(int index, int value) {

		if (index < 0 || index > length) {
			return false;
		}
		Node newNode = new Node(value);
		if (index == 0) {
			prepandLLNode(value);
			return true;
		}
		if (index == length) {
			appendLLNode(value);
			return true;
		}
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;

	}

	public Node removeLastLL() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
			length = 0;
			return temp;
		}
		Node prev = temp;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		tail = prev;
		length--;
		return temp;
	}

	public Node removeFirst() {

		if (length == 0)
			return null;
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
			length = 0;
			return temp;
		}

		head = temp.next;
		temp.next = null;
		length--;
		return temp;

	}

	public Node removeLL(int index) {
		if (length < 0 || length <= index)
			return null;
		if (index == 0) {
			return removeFirst();
		}
		if (length - 1 == index)
			return removeLastLL();
		Node temp = head;
		Node prev = temp;
		for (int i = 0; i < index; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;

	}
	
	public Node getLL(int index) {
		if (length < 0 || length <= index)
			return null;
		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public boolean setLL(int index,int value) {
		if (length < 0 || length <= index)
			return false;
		Node temp=getLL(index);
		temp.value=value;
		return true;
	}

}
