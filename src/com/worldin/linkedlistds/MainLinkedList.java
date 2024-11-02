package com.worldin.linkedlistds;

import com.worldin.linkedlistds.LinkedListDS.Node;

public class MainLinkedList {
	
	public static void main(String[] args) {
		
		LinkedListDS list = new LinkedListDS(2);
		
		list.appendLLNode(4);
		list.appendLLNode(5);
		list.prepandLLNode(1);
		list.prepandLLNode(0);
		
		System.out.println("The length :"+list.length);
//		list.printLinkedList();
		
	    list.insertListNode(3, 3);
		
		list.printLinkedList();
		System.out.println("");
		
		System.out.println(list.removeFirst().value+" size :"+list.length);
		System.out.println(list.removeFirst().value+" size :"+list.length);
//		System.out.println(list.removeFirst().value+" size :"+list.length);
		
		System.out.println(list.removeLastLL().value+" size :"+list.length);
//		System.out.println(list.removeLastLL().value+" size :"+list.length);
//		System.out.println(list.removeLastLL().value+" size :"+list.length);
		
//		System.out.println(list.removeFirst()+" size :"+list.length);
		
		list.printLinkedList();
		System.out.println("");
		
//		System.out.println(list.removeLL(1).value);
//		list.printLinkedList();
//		System.out.println("");
//		System.out.println(list.removeLL(1).value);
//		list.printLinkedList();
//		System.out.println("");
		System.out.println(list.getLL(2).value);
		list.setLL(2, 10);
		list.printLinkedList();
		System.out.println("");
		
	}

}
