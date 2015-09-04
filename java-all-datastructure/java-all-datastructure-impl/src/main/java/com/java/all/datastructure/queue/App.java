package com.java.all.datastructure.queue;

import com.java.all.datastructure.PQueue;
import com.java.all.datastructure.PQueueException;

public class App {
	public static void main(String[] args) {
		PQueue<Character> queue = new PQueueImpl<Character>();
		try {
			queue.enqueue('a');
			queue.enqueue('b');
			queue.enqueue('c');
			queue.enqueue('d');

			queue.dequeue();
			queue.dequeue();
			queue.dequeue();

			queue.enqueue('p');
			queue.enqueue('q');
			queue.enqueue('r');
			queue.enqueue('s');
			queue.enqueue('t');
			queue.enqueue('u');
		} catch (PQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
