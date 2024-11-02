package com.worldin.stackds;

public class MainStack {
	
	public static void main(String[] args) {
		
		StackDs stack = new StackDs(5);
		
		stack.push(10);
		
		stack.push(3);
		
		stack.push(7);
		
		stack.printStack();
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
		System.out.println("---------------");
		
		stack.printStack();
	}

}
