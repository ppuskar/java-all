package com.java.all.thread.concurrency.threads;

import com.java.all.thread.concurrency.data.Counter;

public class ModifierThread implements Runnable {

	private Counter counter;

	public ModifierThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		System.out.println("Modifier thread.");
		for (int i = 0; i < 10; i++) {
			counter.updateCounter(10);
		}
	}

}
