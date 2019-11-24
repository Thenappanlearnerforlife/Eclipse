package com.commonSeleniumAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
	
	
	
	@Test
	public void AlertBox() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thenappan Saravanan\\Downloads\\Selenium Jars\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		WebElement AlertBox=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		AlertBox.click();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		WebElement ConfirmAlertBox=driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		ConfirmAlertBox.click();
		
		Alert cbox=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		cbox.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert promptal=driver.switchTo().alert();
		
		promptal.sendKeys(""+Keys.CLEAR);
		
		promptal.sendKeys("Test Leaf Testing Site7");
		Thread.sleep(5000);
		
		promptal.accept();
		
		WebElement LinkBreakAlert=driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
		
		LinkBreakAlert.click();
		
		Alert linkAlert=driver.switchTo().alert();
		
		System.out.println(linkAlert.getText());
		
		linkAlert.accept();
		
		
		
		
		
		
		
		
		
		
		
	}

}
