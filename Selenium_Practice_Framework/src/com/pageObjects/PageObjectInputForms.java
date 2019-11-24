package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageObjectInputForms {
	
	
	@FindBy(xpath="//input[@name='first_name']")
	public static WebElement FirstName;
	
	@FindBy(name="last_name")
	public static WebElement LastName;
	
	@FindBy(xpath="//input[contains(@placeholder,'E-Mail')]")
	public static WebElement Email;
	
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement Phone;
	
	@FindBy(xpath="//*[@name='address']")
	public static WebElement Address;
	
	@FindBy(xpath="//div[@class='input-group']/span/following::input[@name='city']")
	public static WebElement City;
	
	@FindBy(xpath="//select[@name='state']")
	public static WebElement State;
	
	@FindBy(xpath="//span[@class='input-group-addon']/parent::div[@class='input-group']/input[@name='zip']")
	public static WebElement Zipcode;
	
	@FindBy(xpath="//input[@name='website']")
	public static WebElement DomainName;
	
	@FindBy(xpath="//input[@name='hosting']")
	public static List<WebElement> Hosting;
	
	@FindBy(xpath="//textarea[@name='comment']")
	public static WebElement ProjectDescription;
	
	@FindBy(xpath="//button[text()='Send ']")
	public static WebElement SendButton;
	
	
	

	
	
	
	
	
	

}
