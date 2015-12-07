package com.java.all.datastructure.tree.heap;

import com.java.all.datastructure.tree.heap.model.AbstractHeapData;

public class App {

	public static void main(String[] args) {
		PBinaryHeapImpl pbImpl = new PBinaryHeapImpl(16);
		pbImpl.add(getHeapData(30));
		pbImpl.add(getHeapData(40));
		pbImpl.add(getHeapData(20));
		pbImpl.add(getHeapData(70));
		pbImpl.add(getHeapData(50));
		pbImpl.add(getHeapData(10));

		System.out.println(pbImpl.remove().getData());
		System.out.println(pbImpl.remove().getData());
		System.out.println(pbImpl.remove().getData());
		System.out.println(pbImpl.remove().getData());
		System.out.println(pbImpl.remove().getData());
		System.out.println(pbImpl.remove().getData());
	}

	/**
	 * Gets the heap data.
	 *
	 * @param data
	 *            the data
	 * @return the heap data
	 */
	public static HeapData getHeapData(int data) {
		HeapData heapData = new HeapData();
		heapData.setData(data);
		return heapData;
	}

}
