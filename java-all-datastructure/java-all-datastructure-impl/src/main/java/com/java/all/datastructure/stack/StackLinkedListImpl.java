package com.java.all.datastructure.stack;

import com.java.all.datastructure.PStack;

public class StackLinkedListImpl implements PStack {

	private final int[] DATA_STORE;
	private int topIndex;
	private int initialcapacity;

	public StackLinkedListImpl(int initialSize) {
		this.DATA_STORE = new int[initialSize];
		this.topIndex = -1;
		this.initialcapacity = initialSize;
	}

	@Override
	public void push(int data) {
		if (topIndex < (initialcapacity - 1)) {
			DATA_STORE[++topIndex] = data;
		} else {
			System.out.println("Stack is full..");
		}
	}

	@Override
	public int pop() {
		if (topIndex != -1)
			return DATA_STORE[topIndex--];

		System.out.println("Stack is empty..");
		return -1;
	}

	@Override
	public int peek() {
		if (topIndex != -1)
			return DATA_STORE[topIndex];
		System.out.println("Stack is empty..");
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
