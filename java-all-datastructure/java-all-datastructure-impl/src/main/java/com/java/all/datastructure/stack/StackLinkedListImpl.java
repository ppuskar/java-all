package com.java.all.datastructure.stack;

import com.java.all.datastructure.PStack;

public class StackLinkedListImpl<T> implements PStack<T> {

	private int initialCapacity = 10;
	private T[] DATA_STORE;
	private int topIndex;
	private int initialcapacity;

	@SuppressWarnings("unchecked")
	public StackLinkedListImpl(int initialSize) {
		this.topIndex = -1;
		this.initialcapacity = initialSize;
		DATA_STORE = (T[]) new Object[Math.max(initialSize, initialCapacity)];
	}

	@Override
	public void push(T data) {
		if (topIndex < (initialcapacity - 1)) {
			DATA_STORE[++topIndex] = data;
		} else {
			System.out.println("Stack is full..");
		}
	}

	@Override
	public T pop() {
		if (topIndex != -1)
			return DATA_STORE[topIndex--];

		System.out.println("Stack is empty..");
		return null;
	}

	@Override
	public T peek() {
		if (topIndex != -1)
			return DATA_STORE[topIndex];
		System.out.println("Stack is empty..");
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
