package com.java.all.datastructure;

public interface PStack<T> {

	void push(T data);

	T pop();

	T peek();

	int size();
}
