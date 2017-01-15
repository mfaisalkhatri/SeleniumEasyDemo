package com.SeleniumEasy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.SeleniumEasy.Pages.Checkboxdemo;


public class Checkboxcases {

	WebDriver driver;
	String baseurl = "http://www.seleniumeasy.com/test/basic-checkbox-demo.html";
	
	
	@Test
	public void ChkTest1 () {
		
		driver= new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		Checkboxdemo chkdemo = new Checkboxdemo(driver);
		chkdemo.checkboxdemo();
		
		driver.quit();
	}
	
}
