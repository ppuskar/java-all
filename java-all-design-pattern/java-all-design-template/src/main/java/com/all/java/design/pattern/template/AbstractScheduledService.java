package com.all.java.design.pattern.template;

import java.util.Date;

import com.all.java.design.pattern.template.model.ExecutorContext;

public abstract class AbstractScheduledService {

	public final void submit(final long scheduledToRunAfter) {
		System.out.println("Executing task...");
		Thread t = new Thread(new Runnable() {

			public void run() {
				ExecutorContext executorContext = new ExecutorContext();
				executorContext.setScheduleRequestAt(new Date());
				executorContext.setScheduledAfter(scheduledToRunAfter);
				System.out.println("Going to sleep...");
				try {
					Thread.sleep(scheduledToRunAfter);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Waking up from  sleep...");
				execute(executorContext);
			}
		});
		t.start();
	}

	protected abstract void execute(ExecutorContext context);
}
