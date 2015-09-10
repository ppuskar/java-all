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
			System.out.println("Capacity :" + queue.capacity());
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			System.out.println("Capacity :" + queue.capacity());

			queue.enqueue('p');
			queue.enqueue('q');
			queue.enqueue('r');
			queue.enqueue('s');
			queue.enqueue('t');
			System.out.println("Capacity :" + queue.capacity());
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.enqueue('u');
			queue.enqueue('v');
			queue.enqueue('w');
			queue.enqueue('x');
			queue.enqueue('A');
			queue.enqueue('B');
			queue.enqueue('C');
			queue.enqueue('D');
			System.out.println("Capacity :" + queue.capacity());
			while (queue.size() != 0) {
				System.out.println(queue.dequeue());
			}
		} catch (PQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
