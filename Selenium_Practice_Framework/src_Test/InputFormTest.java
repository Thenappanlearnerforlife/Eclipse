
import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pageObjects.PageObjectInputForms;
import com.pageObjects.utils.CommonFunctions;

public class InputFormTest extends TestBase{
	
	public static WebDriver driver;
	
  @Test
  public void inputforms() throws IOException, InterruptedException, AWTException
  {
	  
	  driver=TestBase.driver;
	  
	  System.out.println(TestBase.inputFile);
	  
	  FileInputStream file=new FileInputStream(TestBase.inputFile);
	  HSSFWorkbook workbook=new HSSFWorkbook(file);
	  
	  Sheet sheet=workbook.getSheet("Sheet1");
	  System.out.println("done");
	  
	  System.out.println("Row Count:"+sheet.getLastRowNum());
	  
	  
	  double phoneno;
	int zipCode;
	  String fname,lname,email,phone,address,city,state,domain,hosting,projectDescription;
	  
	  for(int i=1;i<=sheet.getLastRowNum();i++)
	  {
		  
		  fname=sheet.getRow(i).getCell(0).getStringCellValue();
		  
		  lname=sheet.getRow(i).getCell(1).getStringCellValue();
		  
		  email=sheet.getRow(i).getCell(2).getStringCellValue();
		  
		  phoneno= sheet.getRow(i).getCell(3).getNumericCellValue();
		  
		  System.out.println(phoneno);
		  
		  address=sheet.getRow(i).getCell(4).getStringCellValue();
		  
		  city=sheet.getRow(i).getCell(5).getStringCellValue();
		  state=sheet.getRow(i).getCell(6).getStringCellValue();
		  
		  zipCode=(int) sheet.getRow(i).getCell(7).getNumericCellValue();
		  
		  domain=sheet.getRow(i).getCell(8).getStringCellValue();
		  
		  hosting=sheet.getRow(i).getCell(9).getStringCellValue();
		  
		  projectDescription=sheet.getRow(i).getCell(10).getStringCellValue();
		  
		  PageFactory.initElements(driver,PageObjectInputForms.class);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.FirstName, fname);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.LastName, lname);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.Email, email);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.Phone, phoneno);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.Address, address);		  
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.City, city);
		  
		  CommonFunctions.click(PageObjectInputForms.State);
		  
		  CommonFunctions.SelectDropDown(PageObjectInputForms.State,state);
		  
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.Zipcode, zipCode);
		 
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.DomainName, domain);
		  CommonFunctions.nonSelectDropdown(PageObjectInputForms.Hosting,hosting);	
		  CommonFunctions.txt_sendkeys(PageObjectInputForms.ProjectDescription,projectDescription);
		  
		  Thread.sleep(5000);
		  
		  CommonFunctions.GetScreenshot(driver,"screenshot1",".png");
		  CommonFunctions.click(PageObjectInputForms.SendButton);
	  }
	  
	  
	  
	  
	  
	  
  }
}
