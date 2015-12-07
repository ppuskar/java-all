package com.java.all.datastructure.tree.heap;

import com.java.all.datastructure.tree.heap.model.AbstractHeapData;

public abstract class AbstractBinaryHeapImpl implements
		BinaryHeap<AbstractHeapData> {

	protected final AbstractHeapData storedData[];
	protected final int DEFAULT_SIZE = 16;
	protected int capacity;

	/**
	 * Instantiates a new abstract binary heap impl.
	 */
	@SuppressWarnings("unchecked")
	protected AbstractBinaryHeapImpl() {
		capacity = DEFAULT_SIZE;
		storedData = new HeapData[capacity];
	}

	/**
	 * Instantiates a new abstract binary heap impl.
	 *
	 * @param newSize
	 *            the new size
	 */
	@SuppressWarnings("unchecked")
	protected AbstractBinaryHeapImpl(int newSize) {
		capacity = newSize > DEFAULT_SIZE ? DEFAULT_SIZE : newSize;
		storedData = new HeapData[capacity];
	}

	/**
	 * to attain heap property. Heap Property : All nodes are either greater
	 * than or equal to or less than or equal to each of its children, according
	 * to a comparison predicate defined for the heap.
	 */
	protected void heapify(AbstractHeapData[] t, int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int largest = i;

		if (left <= getHeapLength() && t[left].isGreaterThen.test(t[largest])) {
			largest = left;
		}
		if (right <= getHeapLength() && t[right].isGreaterThen.test(t[largest])) {
			largest = right;
		}

		if (largest != i) {
			// not balanced, heapify
			// swap t[i] and t[latgest]
			swap(t, i, largest);
			heapify(t, largest);
		}
	}

	protected void heapifyUp(AbstractHeapData[] t, int i) {
		if (i == 0) {
			return;
		}
		int parent = (i / 2) - 1;
		if (t[parent] != null && t[parent].isLessThen.test(t[i])) {
			swap(t, parent, i);
			heapifyUp(t, parent);
		}
	}

	protected void heapifyDown(AbstractHeapData[] data, int i) {

		int left = 2 * i;
		int right = 2 * i + 1;
		int largest = i;

		if (left <= getHeapLength()
				&& data[left].isGreaterThen.test(data[largest])) {
			largest = left;
		}
		if (right <= getHeapLength()
				&& data[right].isGreaterThen.test(data[largest])) {
			largest = right;
		}

		if (largest != i) {
			// not balanced, heapify
			// swap t[i] and t[latgest]
			swap(data, i, largest);
			heapify(data, largest);
		}

	}

	protected void swap(AbstractHeapData[] dataArray, int i, int j) {
		AbstractHeapData t = dataArray[i];
		dataArray[i] = dataArray[j];
		dataArray[j] = t;
	}

	protected abstract int getHeapLength();
}
