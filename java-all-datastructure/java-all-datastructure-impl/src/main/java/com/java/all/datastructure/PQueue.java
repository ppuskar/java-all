package com.java.all.datastructure;

public interface PQueue<T> {

	void enqueue(T data);

	T dequeue();

	int size();
}
