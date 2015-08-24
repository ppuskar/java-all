package com.java.all.thread.concurrency.threads;

import com.java.all.thread.concurrency.data.Counter;

/**
 * 
 * @author Illusion
 *
 */
public class ReaderThread implements Runnable {

	private Counter counter;

	public ReaderThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		System.out.println("ReaderThread.");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread id : " + Thread.currentThread().getId()
					+ "    read value   :" + counter.getCount());
		}
	}

}
