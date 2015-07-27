package com.all.java.design.pattern.template.service;

import com.all.java.design.pattern.template.AbstractScheduledService;
import com.all.java.design.pattern.template.model.ExecutorContext;

public class SampleScheduledTaskService extends AbstractScheduledService {

	@Override
	protected void execute(ExecutorContext context) {
		// TODO Auto-generated method stub
		System.out.println("Executing scheduled task, which was scheduled at :"
				+ context.getScheduleRequestAt().toGMTString()
				+ " and to run after :" + context.getScheduledAfter()
				+ " milliseconds.");

	}

}
