package com.java.all.datastructure.queue;

import com.java.all.datastructure.PQueue;
import com.java.all.datastructure.PQueueException;

public class PQueueImpl<T> implements PQueue<T> {

	private final static int DEFAULT_INITIAL_SIZE = 5;
	@SuppressWarnings("unchecked")
	private T DATA_ARRAY[] = (T[]) new Object[DEFAULT_INITIAL_SIZE];
	private int front = -1;// dequeued using this
	private int rear = -1;// enqueued usinbg this
	private int currentQueueCapacity;
	private int totalDataCount = 0;

	/**
	 * default constructor, initializes queue with default size 10.
	 */
	public PQueueImpl() {
		this(DEFAULT_INITIAL_SIZE);
	}

	/**
	 * 
	 * @param initialSize
	 *            default initial size of the queue.
	 */
	public PQueueImpl(int initialSize) {
		currentQueueCapacity = Math.max(initialSize, DEFAULT_INITIAL_SIZE);
	}

	/**
	 * 
	 */
	@Override
	public void enqueue(T data) {
		// check if space available
		if ((front == 0 && rear == currentQueueCapacity - 1)
				|| front == rear + 1) {
			// if not then grow the queue size
			// and add data to the new array
			// replace the old array with the new array.
			grow();
		}
		if (front == -1) {
			front++;
		}
		// ensure that the queue is circular.
		rear = (rear + 1) % currentQueueCapacity;
		DATA_ARRAY[rear] = data;
		totalDataCount++;
	}

	private void grow() {
		int newQueueSize = (currentQueueCapacity + (currentQueueCapacity >> 1));
		@SuppressWarnings("unchecked")
		T[] newDataArray = (T[]) new Object[newQueueSize];
		int holdTotalSize = totalDataCount;
		int i = 0;
		while (holdTotalSize != 0) {
			newDataArray[i++] = DATA_ARRAY[front];
			front = (front + 1) % currentQueueCapacity;
			holdTotalSize--;
		}
		rear = totalDataCount - 1;
		front = 0;
		currentQueueCapacity = newQueueSize;
		DATA_ARRAY = newDataArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T dequeue() throws PQueueException {
		if (totalDataCount == 0) {
			throw new PQueueException("Queue is empty.");
		}
		T item = DATA_ARRAY[front];
		// if front and rear were on same location, reset it to -1 since we
		// already have taken data out of the array
		if (front == rear) {
			front = rear = -1;
		} else {
			// make sure that the queue accesses the array in a curcular way.
			front = (front + 1) % currentQueueCapacity;
		}

		totalDataCount--;
		return item;
	}

	@Override
	public int size() {
		return totalDataCount;
	}

	@Override
	public T peek() throws PQueueException {
		if (totalDataCount == 0) {
			throw new PQueueException("Queue is empty.");
		}
		return DATA_ARRAY[front];
	}

}
