package com.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties Prop;
	public static String browser;
	public static String urlName;
	public static String driverLocation;
	public static String inputFile,screenpath;
	
	@BeforeTest
	public void webDriverInitial() throws IOException
	{
		Prop=new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\Selenium Interview Preparation\\Selenium Training\\Selenium_Practice_Framework\\common.properties");
			Prop.load(file);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser=Prop.getProperty("BrowserName");
		urlName=Prop.getProperty("Url");
		driverLocation=Prop.getProperty("DriverFolderpathname");
		inputFile=Prop.getProperty("Excel_Input_path");
		screenpath=Prop.getProperty("Screenshotpah");
		System.out.println(driverLocation);
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation+"\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		}
		else
		{	
			System.setProperty("webdriver.ie.driver",driverLocation+"\\IEDriverServer");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		driver.get(urlName);
		System.out.println("Successfully Launched");
		//return driver;
		}
	
	@AfterTest
	public void CloseDriver()
	{
		
		driver.close();
	}
	
	
	
	

}
