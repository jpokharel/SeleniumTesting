package com.testing.junittests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SimpleTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(/*FirstTestClass.class,*/SecondTestClass.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if(result.wasSuccessful())
			System.out.println(".....SUCCESSFUL TESTS....");
		else
			System.out.println(".....TESTS FAILED........");
		System.out.println("Total time taken was: "+result.getRunTime());
		System.out.println("Failure Count: "+result.getFailureCount()+"\nIgnore Count: "+result.getIgnoreCount()+"\nRun Count: "+result.getRunCount());
	}
}
