package com.java.all.datastructure.tree.heap;

import com.java.all.datastructure.tree.heap.model.AbstractHeapData;

public class PBinaryHeapImpl extends AbstractBinaryHeapImpl {

	private int size = -1;

	public PBinaryHeapImpl(int initialCapacity) {
		super(initialCapacity);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size > 0;
	}

	@Override
	public HeapData peek() {
		return (HeapData) storedData[0];
	}

	@Override
	public void add(AbstractHeapData data) {
		// TODO Auto-generated method stub
		int newLocation = size + 1;
		if (newLocation <= capacity) {
			storedData[newLocation] = data;
			size++;
			heapifyUp(storedData, newLocation);
		}
	}

	@Override
	public AbstractHeapData remove() {
		swap(storedData, 0, size);
		AbstractHeapData hold = storedData[size];
		storedData[size--] = null;
		heapifyDown(storedData, 0);
		return hold;
	}

	@Override
	protected int getHeapLength() {
		return size;
	}

}
