package com.testing.junittests;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestSuiteWithConstructor {

	public static void main(String...strings){
		TestSuite testSuite=new TestSuite(/*FirstTestClass.class,*/SecondTestClass.class);
		TestResult testResult=new TestResult();
		testSuite.run(testResult);
		if(testResult.wasSuccessful())
			System.out.println(".....SUCCESSFUL TESTS....");
		else 
			System.out.println(".....TESTS FAILED........");
	
		System.out.println("Failure Count: "+testResult.failureCount()
		+"\nError Count: "+testResult.errorCount()
		+"\nRun Count: "+testResult.runCount());
	}
}
