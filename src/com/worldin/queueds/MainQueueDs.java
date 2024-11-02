package com.worldin.queueds;

public class MainQueueDs {
	
	public static void main(String[] args) {
		
		QueueDS queue= new QueueDS();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		queue.printQueue();
		
		System.out.println(queue.dequeue().value);
		System.out.println(queue.dequeue().value);
		System.out.println(queue.dequeue().value);
		System.out.println(queue.dequeue().value);
		System.out.println(queue.dequeue().value);
		System.out.println(queue.dequeue());
		
	}

}
