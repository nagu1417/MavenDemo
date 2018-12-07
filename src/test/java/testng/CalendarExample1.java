package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalendarExample1 
{

	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	  WebElement calendarItem=driver.findElement(By.cssSelector("input[id*='datepicker']"));
	  calendarItem.click();
	  
	WebElement webTable=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	  
	 List<WebElement> dataElements=webTable.findElements(By.tagName("td"));
	 for (int i = 0; i < dataElements.size(); i++) 
	 {
		 String strText=dataElements.get(i).getText();
		 System.out.println("Text:"+strText);
	}
	 
	 
	  
	 
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
  }
  
  @AfterTest
  public void afterTest() {
	 // driver.close();
  }


}
