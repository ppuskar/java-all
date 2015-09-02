package com.java.all.datastructure.queue;

import com.java.all.datastructure.PQueue;

public class PQueueImpl<T> implements PQueue<T> {

	private final int INITIAL_SIZE = 16;
	private final Object DATA_ARRAY[] = new Object[INITIAL_SIZE];
	int front = INITIAL_SIZE;
	int rear = -1;

	/**
	 * -------------------------------------------------------------------
	 * 	Front |		|		|		|		|		|		|		| Rear
	 * -------------------------------------------------------------------
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public void enqueue(T data) {
		/**
		 * add element at rear++;
		 */
	}

	@SuppressWarnings("unchecked")
	@Override
	public T dequeue() {
		/**
		 * Take the element front and decrement front, return the element.
		 */
		return null;
	}

	private boolean isFull() {
		return rear == INITIAL_SIZE;
	}

	private boolean isEMpty() {
		return front == rear;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
