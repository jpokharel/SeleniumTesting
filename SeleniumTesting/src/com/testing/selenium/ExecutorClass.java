package com.testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutorClass {

	public static void main(String args[]) {
		String webURL = "https://jiwanpokharel.blogspot.com";
		String titleValue = "JIWANPOKHAREL";
		String tagName;
		// Create the Firefox WebDriver
		WebDriver webDriver = new FirefoxDriver();

		// Call an API from firefox Driver
		webDriver.get(webURL);

		if (titleValue.equalsIgnoreCase(webDriver.getTitle())) {
			System.out.println("The titles are same i.e. " + titleValue.toLowerCase());
		} else
			System.out.println("Titles do not match");
		try {
			tagName = webDriver.findElement(By.id("email")).getTagName();
			System.out.println("Tag Name is: " + tagName);
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 

			// When work is done, the webriver is closed
			webDriver.close(); //This closes only the parent window
			
			webDriver.quit(); //Closes the child windows like pop ups too and upper code becomes redundant.

			// To close the program
			System.exit(0);
		}
	}
}
