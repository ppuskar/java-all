package com.java.all.datastructure;

public interface PQueue<T> {

    void enqueue(T data);

    T dequeue() throws PQueueException;

    int size();

    T peek() throws PQueueException;

    int capacity();

}
