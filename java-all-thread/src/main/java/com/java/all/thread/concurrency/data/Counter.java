package com.java.all.thread.concurrency.data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private int count;
	Lock lock = new ReentrantLock();

	/**
	 * @return the count
	 */
	public int getCount() {
		int value = -1;
		// lock.lock();
		value = count;
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// lock.unlock();
		return value;

	}

	public void updateCounter(int updateValueBy) {
		lock.lock();
		try {
			Thread.sleep(1500);
			this.count = getCount() + updateValueBy;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();

	}

}
