package com.all.java.design.pattern.template.model;

import java.util.Date;

/**
 * Contains information about task context.
 * 
 * @author Praveen.Puskar
 *
 */
public class ExecutorContext {

	private long scheduledAfter;
	private Date scheduleRequestAt;

	/**
	 * @return the scheduledAfter
	 */
	public long getScheduledAfter() {
		return scheduledAfter;
	}

	/**
	 * @param scheduledAfter
	 *            the scheduledAfter to set
	 */
	public void setScheduledAfter(long scheduledAfter) {
		this.scheduledAfter = scheduledAfter;
	}

	/**
	 * @return the scheduleRequestAt
	 */
	public Date getScheduleRequestAt() {
		return scheduleRequestAt;
	}

	/**
	 * @param scheduleRequestAt
	 *            the scheduleRequestAt to set
	 */
	public void setScheduleRequestAt(Date scheduleRequestAt) {
		this.scheduleRequestAt = scheduleRequestAt;
	}

}
