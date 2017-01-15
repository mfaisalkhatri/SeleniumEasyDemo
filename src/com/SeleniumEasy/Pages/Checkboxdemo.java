package com.SeleniumEasy.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Checkboxdemo {

	
	public WebDriver driver = null;
	
	
	public void checkboxdemo () {
		
		By chbx1 = By.id("isAgeSelected");
		By msg1 = By.cssSelector("#txtAge");
		
		WebElement chk1 =  driver.findElement(chbx1);
		chk1.click();
		
		String msg = driver.findElement(msg1).getText();
		
		System.out.println(msg);
		
	}
	
	public Checkboxdemo(WebDriver driver) {
		this.driver = driver; 
	}
	
	
}
