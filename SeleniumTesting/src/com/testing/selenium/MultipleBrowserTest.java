package com.testing.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author jiwanpokharel89
 */
public class MultipleBrowserTest {

	public static void main(String[] args) {
		/*
		 * Created all the web drivers needed.
		 * Also can initialize all these drivers in the Constructor.
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver firefox=new FirefoxDriver();
		WebDriver chrome=new ChromeDriver();
		WebDriver iexplorer=new InternetExplorerDriver();
		WebDriver safari=new SafariDriver();
		
		String url="https://jiwanpokharel.blogspot.com";
		/*
		 * Calling all the browsers for the URL.
		 */
		firefox.get(url);
		chrome.get(url);
		iexplorer.get(url);
		safari.get(url);

	}

}
