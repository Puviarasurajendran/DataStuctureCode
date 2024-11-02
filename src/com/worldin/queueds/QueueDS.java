package com.worldin.queueds;

public class QueueDS {
	
	Node first;
	Node last;
	int length;
	
	class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value=value;
		}
	}
	
	public QueueDS(int value) {
		Node newNode= new Node(value);
		first=newNode;
		last=newNode;
		length=1;
	}
	
	public QueueDS() {
		
	}

	public void printQueue() {
		Node temp=first;
		for (int i = 0; i <length; i++) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void enqueue(int value) {
		Node newNode= new Node(value);
		if(length==0) {
			first=newNode;
			last=newNode;
		}
		else {
			last.next=newNode;
			last=newNode;
		}
		length++;
	}
	
	public Node dequeue() {
		if(length==0) return null;
		Node temp= first;
		if(length==1) {
			first=null;
			last=null;
			length--;
			return temp;
		}
		first=temp.next;
		temp.next=null;
		length--;
		return temp;
	}

}
