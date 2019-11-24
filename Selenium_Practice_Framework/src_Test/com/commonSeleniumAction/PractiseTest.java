package com.commonSeleniumAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import okio.Options;

public class PractiseTest {

	
	
	@Test
	public void practiceTest()
	{
	
	//ChromeOptions option=new ChromeOptions();
	//option.addArguments("--start-maximized");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	driver.get("http://leafground.com/pages/Edit.html");
	
	WebElement disablebox=driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/label[text()='Confirm that edit field is disabled']/following::input"));
	
	
		System.out.println(disablebox.isEnabled());
		
		System.out.println(disablebox.isDisplayed());
	
	
	}
	
}
