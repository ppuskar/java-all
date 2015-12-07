package com.java.all.datastructure.tree.heap.model;

import java.util.function.Predicate;

public abstract class AbstractHeapData {
	private int data;

	public Predicate<AbstractHeapData> isGreaterThen = anotherData -> {
		return this.getData() > anotherData.getData();
	};
	public Predicate<AbstractHeapData> isLessThen = anotherData -> {
		return this.getData() > anotherData.getData();
	};

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
