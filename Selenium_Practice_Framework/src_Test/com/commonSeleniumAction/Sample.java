package com.commonSeleniumAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Sample {
	
	public static WebElement q;
	
	@Test
	public void search()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		PageFactory.initElements(driver, Sample.class);
		
		q.sendKeys("Thenappan \n");
		
		 
		
	}

}
