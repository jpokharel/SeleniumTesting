package com.testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99Testing {
	private static String urlValue="http://demo.guru99.com/V4/";
	static WebDriver webDriver;
	static WebDriverWait webDriverWait;
	
	public static void createWebDriver(){
		webDriver=new FirefoxDriver();
		webDriver.get(urlValue);
		webDriverWait=new WebDriverWait(webDriver,3);
	}
	
	public static void closeDrivers(){
		webDriver.quit();
	}
	
	public static void Login(){
		webDriver.findElement(By.name("uid")).sendKeys("mngr33827");
		webDriver.findElement(By.name("password")).sendKeys("evybEhA");
		webDriver.findElement(By.name("btnLogin")).click(); 
	}
	
	public static void deleteCustomer(){
		webDriver.findElement(By.linkText("Delete Customer")).click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		webDriver.findElement(By.name("cusid")).sendKeys("53920");
		webDriver.findElement(By.name("AccSubmit")).click();
		webDriver.switchTo().alert().accept();
		
	}
	public static void main(String[] args) {
		createWebDriver();
		Login();
		deleteCustomer();
		closeDrivers();
	}

}
