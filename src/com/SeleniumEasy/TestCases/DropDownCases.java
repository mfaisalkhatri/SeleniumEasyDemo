package com.SeleniumEasy.TestCases;

import java.awt.Desktop.Action;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownCases {

	public WebDriver driver;
	
	String baseurl = "http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
	
	@Test(enabled=false)
	public void DropdownCase1 () {
		
		driver = new FirefoxDriver ();
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		Select select = new Select (driver.findElement(By.cssSelector("#multi-select")));
				select.selectByVisibleText("Ohio");
				select.selectByValue("California");
				select.selectByIndex(6);
		WebElement firstsel = driver.findElement(By.cssSelector("#printMe"));		
		firstsel.click();
		
		WebElement msg = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]"));
		String message = msg.getText();
		
		System.out.println(message);
		System.out.println("End of Test");
				
		driver.quit();
	}
	
	@Test(alwaysRun = true)
	public void DropdownCase2 () {
		
		driver = new FirefoxDriver ();
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		WebElement opt1 = driver.findElement(By.cssSelector("#multi-select option[value = 'California']"));
		WebElement opt2 = driver.findElement(By.cssSelector("#multi-select option[value = 'Florida']"));
		WebElement opt3 = driver.findElement(By.cssSelector("#multi-select option[value = 'Ohio']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL)
		.click(opt1)
		.click(opt2)
		.click(opt3).keyUp(Keys.CONTROL).build().perform();
		
		WebElement selall = driver.findElement(By.cssSelector("#printAll"));		
		selall.click();
		
		WebElement msg = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]"));
		String message = msg.getText();
		
		System.out.println(message);
		System.out.println("End of Test 2 ");
				driver.quit();
		
		
	}
	
}
