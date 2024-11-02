package com.worldin.doublylinkedlistds;

public class DoublyLinkedListDS {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		Node next;
		Node prev;
		int value;

		public Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedListDS(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}

	public void printDLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public void appendDLLNode(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.length = 1;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		length++;
	}

	public void prepandDLLNode(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.length = 1;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		length++;
	}

	public Node removeFirstDLLNode() {
		if (length == 0)
			return null;
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
			length = 0;
			return temp;
		}
		head = head.next;
		head.prev = null;
		temp.next = null;
		length--;
		return temp;
	}

	public Node removeLastDLLNode() {
		if (length == 0)
			return null;
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
			length = 0;
			return temp;
		}
		tail = tail.prev;
		tail.next = null;
		temp.prev = null;
		length--;
		return temp;
	}

	public boolean insertDLLNode(int index, int value) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prepandDLLNode(value);
			return true;
		}
		if (length == index) {
			appendDLLNode(value);
			return true;
		}
		int mid = length / 2;
		Node newNode = new Node(value);
		if (index < mid) {
			Node temp = head;
			Node before = temp;
			for (int i = 0; i < index; i++) {
				before = temp;
				temp = temp.next;
			}
			before.next = newNode;
			newNode.prev = before;
			newNode.next = temp;
			temp.prev = newNode;
		} else {
			Node temp = tail;
			Node before = temp;
			for (int i = length - 1; i >= index; i--) {
				before = temp;
				temp = temp.prev;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = before;
			before.prev = newNode;
		}
		length++;
		return true;
	}

	public Node removeDLLNode(int index) {
		if (index < 0 || index > length)
			return null;
		if (index == 0) {
			return removeFirstDLLNode();
		}
		if (length - 1 == index) {
			return removeLastDLLNode();
		}
		int mid = length / 2;
		Node temp = null;
		if (index < mid) {
			temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}

		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		length--;
		return temp;
	}

	public Node getDLLNode(int index) {
		if (index < 0 || index > length)
			return null;
		if (index == 0) {
			return head;
		}
		if (length - 1 == index) {
			return tail;
		}
		int mid = length / 2;
		Node temp = null;
		if (index < mid) {
			temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}

		}
		return temp;

	}

	public boolean setDLLNode(int index, int value) {
		if (index < 0 || index > length)
			return false;
		Node temp = getDLLNode(index);
		temp.value = value;
		return true;
	}

}
