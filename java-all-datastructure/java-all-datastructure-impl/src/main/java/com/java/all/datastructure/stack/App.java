package com.java.all.datastructure.stack;

import com.java.all.datastructure.Stack;

public class App {

	public static void main(String[] args) {
		Stack stack = new StackLinkedListImpl(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// System.out.println("peek:"+stack.peek());
		stack.push(70);
		stack.push(80);
		stack.push(90);
		System.out.println(stack.pop());
		// System.out.println("peek:"+stack.peek());
		System.out.println(stack.pop());
		// System.out.println("peek:"+stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
