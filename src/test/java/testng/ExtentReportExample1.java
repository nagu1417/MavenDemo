package testng;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExample1 
{

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	
	
  @Test
  public void f() throws InterruptedException {
	  extent=new ExtentReports("F:\\ExtentReports\\ExtentReport.html");
	  logger=extent.startTest("Test1");
	  
	  logger.log(LogStatus.INFO, "Browser Opened and Maximized");
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  logger.log(LogStatus.INFO, "URL Opened");
	  
	  Thread.sleep(3000);
	 WebElement dragItem=driver.findElement(By.cssSelector("div[class*='ui-draggable']"));
	 WebElement dropItem=driver.findElement(By.cssSelector("div[class*='ui-droppable']"));
	 Actions act=new Actions(driver);
	 logger.log(LogStatus.INFO, "Actions class has been used for drag and drop action");
	 act.dragAndDrop(dragItem, dropItem).build().perform();
	 logger.log(LogStatus.PASS, "Drag and drop action has been done succesfully");
	 
	 
	 
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  /*System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();*/
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  String title=driver.getTitle();
	 
		  Assert.assertEquals(title, "Google");
	 
  }
  
  @AfterTest
  public void afterTest() throws Exception 
  {
	  ITestResult ir = null;
	  if(ir.getStatus()==ITestResult.FAILURE)
	  {
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  String destination="./Screenshots/"+ir.getName()+".jpg";
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File(destination));
		 // FileUtils.copyFile(f1, new File("./Screenshots/"+fileName+".jpg"));
		  logger.addScreenCapture(destination);
		  logger.log(LogStatus.FAIL, "Drag and Drop Test",destination );
	  }
	 extent.endTest(logger);
	 extent.flush();
  }


}
