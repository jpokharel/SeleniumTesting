package com.testing.junittests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SecondTestClass {

	@Test
	public void simplePrint(){
		Assert.assertNotNull("This is null","Jiwan");
	}
	
	@Ignore()
	public void ignoredTest() {
		System.out.println("Just to ignore the test!");
	}
}
