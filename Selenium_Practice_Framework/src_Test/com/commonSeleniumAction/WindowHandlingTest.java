package com.commonSeleniumAction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WindowHandlingTest {
	
	@Test
	public void windowHandlingTest()
	{
		
		
	
		//Dimension dimension=new Dimension(1920,1080);
		//ChromeOptions ch=new ChromeOptions();
		//ch.addArguments("--start--maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().setSize(dimension);
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; newBrwTab()']")).sendKeys(Keys.ENTER);
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			
			String text=it.next();
			
			//System.out.println(driver.switchTo().window(text).getCurrentUrl());
			
			if(driver.switchTo().window(text).getCurrentUrl().equals("https://www.toolsqa.com/"))
			{
				driver.switchTo().window(text);	
				
				System.out.println("Working Fine");
				break;
			}
			
			
			
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
