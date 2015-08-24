package com.java.all.thread.concurrency;

import java.io.Reader;

import com.java.all.thread.concurrency.data.Counter;
import com.java.all.thread.concurrency.threads.ModifierThread;
import com.java.all.thread.concurrency.threads.ReaderThread;

public class ConcurrencyControl {
	public static void main(String[] args) {

		Counter data = new Counter();

		ModifierThread modifier = new ModifierThread(data);
		ReaderThread reader = new ReaderThread(data);

		Thread t = new Thread(modifier);
		Thread t2 = new Thread(modifier);
		Thread t3 = new Thread(modifier);
		Thread tr1 = new Thread(reader);
		Thread tr2 = new Thread(reader);
		Thread tr3 = new Thread(reader);
		Thread tr4 = new Thread(reader);
		Thread tr5 = new Thread(reader);
		t.start();
		t2.start();
		t3.start();
		tr1.start();
		tr2.start();
		tr3.start();
		// tr4.start();
		// tr5.start();
	}

	public static void sleep(long value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
