package com.testing.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitExecutorClass {
	private final String webUrl = "https://google.com";
	public WebDriver webDriver;

	@Before
	public void setUpDriver() {
		webDriver = new FirefoxDriver();
		webDriver.get(webUrl);
	}

	@Test
	public void firstTestCase() {
		System.out.println(webDriver.getCurrentUrl());
	}

	@Test
	public void checkForAssertions() {
		Assert.assertEquals(webUrl, webDriver.getCurrentUrl());
	}

	@After
	public void closeDriver() {
		webDriver.quit();
	}

}
