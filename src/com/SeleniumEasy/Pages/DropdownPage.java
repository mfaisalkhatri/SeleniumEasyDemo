package com.SeleniumEasy.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DropdownPage {

	
	public WebDriver driver = null;
	
	By drop1 = By.cssSelector("#select-demo");
	
	
	public void DropDownCase1() {
		
		WebElement dropdown1 = driver.findElement(drop1);
		Select slt = new Select(dropdown1);
		List<WebElement> allop= slt.getOptions();
		
		int sz = allop.size();
		
		for (int i = 0; i <sz; i++ ) {
			System.out.println (allop.get(i).getText());
		}
		
	}
		
		public void DropDownCase2 () {
		
		WebElement dropdown1 = driver.findElement(drop1);	
		dropdown1.click();
		WebElement monday = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Monday']"));
		monday.click();
		
		WebElement msg = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]"));
		String message = msg.getText();
		System.out.println(message);
		
	}
		
		public void DropdownCase3 () {
			
		WebElement dropdown1 = driver.findElement(drop1);
		
		dropdown1.click();
		dropdown1.sendKeys(Keys.ARROW_DOWN);
		
		/*WebElement mon  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Monday']"));
		WebElement tue  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Tuesday']"));
		WebElement wed  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Wednesday']"));
		WebElement thur = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Thursday']"));
		WebElement sat  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Saturday']"));
		WebElement sun  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Sunday']"));*/
		
		WebElement fri  = dropdown1.findElement(By.cssSelector("#select-demo option[value = 'Friday']"));
		
		Actions act = new Actions(driver);
		act.click(fri)
		.build()
		.perform();
		
		WebElement msg = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]"));
		String message = msg.getText();
		System.out.println(message);
		
			 
		}
	
		public void DropdownCase4 () {
			
			WebElement dropdown1 = driver.findElement(drop1);
			Select sel = new Select (dropdown1);
			sel.selectByIndex(4);
			WebElement msg = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]"));
			String message = msg.getText();
			System.out.println(message);
			
			System.out.println("Second Try!");
			
			sel.selectByValue("Sunday");
			WebElement msg1 = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]"));
			String message1 = msg1.getText();
			System.out.println(message1);
			
		}
	
	
		public void DropdownCase5 ()  { 
			
			WebElement dropdown1 = driver.findElement(drop1);
			
			dropdown1.click();
			
			dropdown1.sendKeys(Keys.ARROW_DOWN);
			
			dropdown1.sendKeys(Keys.ARROW_DOWN);
			
			dropdown1.sendKeys(Keys.ARROW_DOWN);
			
			dropdown1.sendKeys(Keys.ARROW_DOWN);
			
			dropdown1.sendKeys(Keys.ARROW_DOWN);
			
			
			dropdown1.sendKeys(Keys.ENTER);
			//selecting Thursday 
			
			WebElement msg1 = driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]"));
			String message1 = msg1.getText();
			System.out.println(message1);
			
		}
	
		
		
	
	
	public DropdownPage(WebDriver driver) {
		this.driver = driver; 
	}

}


