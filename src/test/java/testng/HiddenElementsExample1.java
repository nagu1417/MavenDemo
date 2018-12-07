package testng;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenElementsExample1 
{

	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

	 List<WebElement> maleRadioButton=driver.findElements(By.xpath("//input[@id='male']"));
	 for (WebElement webElement : maleRadioButton) 
	 {
		 int x=webElement.getLocation().getX();
		 int y=webElement.getLocation().getY();
		 System.out.println("X value:"+x+" and Y value:"+y);
		 if(x>0 || y>0)
		 {
			 webElement.click(); 
			 break;
		 }
		 else
		 {
			 System.out.println("Element is Hidden");
		 }
		
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
