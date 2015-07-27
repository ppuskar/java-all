package com.all.java.design.pattern.template;

import com.all.java.design.pattern.template.service.SampleScheduledTaskService;

public class Applicaiton {

	public static void main(String[] args) {
		SampleScheduledTaskService service = new SampleScheduledTaskService();
		service.submit(5000);
	}

}
