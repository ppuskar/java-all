package com.all.java.design.pattern.template;

import com.all.java.design.pattern.template.service.TestSomethingService;

public class Applicaiton {

	public static void main(String[] args) {
		AbstractScheduledService service = new TestSomethingService();
		service.submit(5000);
	}

}
