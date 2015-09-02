package com.java.all.thread.concurrency;

import java.io.Reader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import com.java.all.thread.concurrency.data.Counter;
import com.java.all.thread.concurrency.threads.ModifierThread;
import com.java.all.thread.concurrency.threads.ReaderThread;

public class ConcurrencyControl {
	public static void main(String[] args) {

		Counter data = new Counter();

		ModifierThread modifier = new ModifierThread(data);
		ReaderThread reader = new ReaderThread(data);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		executor.submit(reader);
		executor.submit(modifier);
		Future<?> submit = executor.submit(reader);
	}

	public static void sleep(long value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void runBatchThread(int numberOfThread) {

	}
}
