package com.SeleniumEasy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SeleniumEasy.Pages.DropdownPage;

public class DropdownTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void StartUp () {
	
		String baseurl = "http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
		driver = new FirefoxDriver();
		
		driver.get(baseurl);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void DropdownCase1 () {
		System.out.println("Test 1 Started");
		DropdownPage dp = new DropdownPage(driver);
		dp.DropDownCase1();
		
		System.out.println("Test 1 End");
		
	}
	
	@Test(priority = 2)
	public void DropdownCase2 () {
		System.out.println("Test 2 Started");
		DropdownPage dp = new DropdownPage(driver);
		dp.DropDownCase2();
		
		System.out.println("Test 2 End");
		
	}
	
	@Test(priority = 3)
	public void DropdownCase3 () {
		
		System.out.println("Test 3 Started");
		DropdownPage dp = new DropdownPage(driver);
		dp.DropdownCase3();
		System.out.println("Test 3 End");
		
	}
	
	@Test(priority = 4)
	public void DropdownCase4 () {
		System.out.println("Test 4 Started");
		DropdownPage dp = new DropdownPage(driver);
		dp.DropdownCase4();
		System.out.println("Test 4 End");
	}
	
	@Test(priority = 5)
	public void DropdownCase5 () {
		
		System.out.println("Test 5 Started");
		DropdownPage dp = new DropdownPage(driver);
		dp.DropdownCase5();
		System.out.println("Test 5 End");
	}	
	

}
