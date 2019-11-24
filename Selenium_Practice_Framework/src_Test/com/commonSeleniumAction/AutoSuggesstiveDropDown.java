package com.commonSeleniumAction;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSuggesstiveDropDown {
	
	@Test
	public void AutoSuggesstTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Game of thrones");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='erkvQe']/li")));
		
		int size1=driver.findElements(By.xpath("//ul[@class='erkvQe']/li")).size();
	
		List<WebElement> autosuggest=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	
		Iterator<WebElement> lt=autosuggest.iterator();
		
		while(lt.hasNext())
		{
			String text=lt.next().getText();
			
			System.out.println(text);
		}
		
		
		
	}
	
	

}
