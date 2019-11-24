package com.pageObjects.utils;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class CommonFunctions {

	public static void txt_sendkeys(WebElement element1, String data) {
		element1.sendKeys(data);
	}

	public static void txt_sendkeys(WebElement element, Double data) {
		element.sendKeys(Double.toString(data));
	}

	public static void SelectDropDown(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public static void txt_sendkeys(WebElement element, int data) {
		// TODO Auto-generated method stub

		element.sendKeys(Integer.toString(data));

	}

	public static void nonSelectDropdown(List<WebElement> element, String data) {
		int list_size = element.size();
		for (int k = 0; k < list_size; k++) {
			String text;
			text = element.get(k).getAttribute("value");
			if (text.equals(data)) {
				element.get(k).click();
			}
		}

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void GetScreenshot(WebDriver driver, String screenshotName, String fileExtension)
			throws IOException, AWTException {
		
		 File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destfile1=new File(TestBase.screenpath+screenshotName+fileExtension);
		 
		 System.out.println(TestBase.screenpath+screenshotName+fileExtension);
		 
		 //FileUtils.copyFile(sourceFile, destfile1);
		 
		FileHandler.copy(sourceFile, destfile1);
		 
		 /* Robot robot=new Robot();
		 * 
		 * Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		 * 
		 * System.out.println(dimension);
		 * 
		 * Rectangle rectangle=new Rectangle(dimension);
		 * 
		 * 
		 * BufferedImage sourceFile1=robot.createScreenCapture(rectangle);
		 * 
		 * File file=new
		 * File("C:\\Users\\Thenappan Saravanan\\Desktop\\Selenium_Screenshot\\image1.png"
		 * );
		 * 
		 * ImageIO.write(sourceFile1,"png", file);
		 */

	}

}
