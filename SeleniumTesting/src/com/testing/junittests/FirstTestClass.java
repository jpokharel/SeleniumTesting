package com.testing.junittests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class FirstTestClass extends TestCase {
	private int initVal;
	private String name;

	@Before
	public void setUp() {
		this.initVal = 251;
		this.name = "Jiwan";

	}

	@Before
	public void beforeTest() {
		System.out.println("This implies start of the test...");
	}

	@Ignore()
	public void ignoredTest() {
		System.out.println("Just to ignore the test!");
	}

	@After
	public void afterTest() {
		System.out.println("This implies after the test.....");
		// Send variables to garbage collection
		this.initVal = 0;
		this.name = null;
		Assert.assertNull("The name variable is not null", this.name);
	}

	@Test
	public void firstTestCase() {
		Assert.assertEquals(251, this.initVal);
		Assert.assertNotNull("The name is null", this.name);
		// Assert.assertTrue((251==this.initVal);
	}
}
