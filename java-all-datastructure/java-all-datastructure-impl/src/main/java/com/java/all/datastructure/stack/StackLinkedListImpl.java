package com.java.all.datastructure.stack;

import com.java.all.datastructure.PStack;

public class StackLinkedListImpl<T> implements PStack<T> {

	private T[] DATA_STORE;
	private int topIndex;
	private int defaultCapacity = 5;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public StackLinkedListImpl(int initialSize) {
		this.topIndex = -1;
		DATA_STORE = (T[]) new Object[Math.max(initialSize, defaultCapacity)];
	}

	@Override
	public void push(T data) {
		if (topIndex >= (defaultCapacity - 1)) {
			grow();
		}
		size++;
		DATA_STORE[++topIndex] = data;
	}

	public void grow() {
		int newCapacity = defaultCapacity + (defaultCapacity >> 1);
		@SuppressWarnings("unchecked")
		T[] newDataStore = (T[]) new Object[newCapacity];

		for (int i = 0; i <= topIndex; i++) {
			newDataStore[i] = DATA_STORE[i];
		}
		DATA_STORE = newDataStore;
		defaultCapacity = newCapacity;
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
		return size;
	}

}
