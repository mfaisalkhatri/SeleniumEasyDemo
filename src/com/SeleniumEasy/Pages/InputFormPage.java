package com.SeleniumEasy.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InputFormPage {

	public WebDriver driver = null;
	
	By fname = By.name("first_name");
	
	@Test
	public void Case1 () {
	
		String baseurl = "http://www.seleniumeasy.com/test/input-form-demo.html";
		driver = new FirefoxDriver ();
		driver.get(baseurl);
		WebElement fn = driver.findElement(fname);
		
		fn.sendKeys("Faisal");
	
	driver.quit();
	}
	
}
