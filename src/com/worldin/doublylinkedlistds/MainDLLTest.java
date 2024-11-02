package com.worldin.doublylinkedlistds;

public class MainDLLTest {
	
	public static void main(String[] args) {
		
		DoublyLinkedListDS dllList= new DoublyLinkedListDS(5);
		
		dllList.appendDLLNode(7);
		dllList.prepandDLLNode(3);
		dllList.appendDLLNode(9);
		dllList.prepandDLLNode(1);
		
		dllList.printDLL();
		
		dllList.removeFirstDLLNode();
		dllList.removeLastDLLNode();
		
		dllList.printDLL();
		
		dllList.removeFirstDLLNode();
		dllList.removeLastDLLNode();
		
		dllList.printDLL();
		
		dllList.insertDLLNode(0, 1);
		dllList.insertDLLNode(2, 10);
		dllList.insertDLLNode(1, 3);
		
		dllList.printDLL();
		
//		dllList.removeDLLNode(1);
//		dllList.removeDLLNode(1);
//		dllList.removeDLLNode(0);
		
		
		System.out.println(dllList.getDLLNode(0).value);
		System.out.println(dllList.getDLLNode(2).value);
		
		dllList.setDLLNode(0, 2);
		dllList.setDLLNode(2, 4);
		dllList.setDLLNode(3, 5);
		dllList.printDLL();
		
	}

}
