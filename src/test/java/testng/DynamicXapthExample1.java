package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DynamicXapthExample1 {
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  driver.get("http://demo.guru99.com/selenium/newtours/index.php");
	  WebElement userName=driver.findElement(By.cssSelector("input[name='userName']"));
	  WebElement password=driver.findElement(By.cssSelector(""));
	  WebElement loginButton=driver.findElement(By.cssSelector(""));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  WebDriverWait wait=new WebDriverWait(driver, 20);
  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
