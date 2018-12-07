package testng;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Log4jExample1 
{

	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  
	  Logger log=Logger.getLogger(Logger.class.getName());
	  PropertyConfigurator.configure("Log4j.properties");
	 
	  log.info("URL has been Opened");

	  Thread.sleep(3000);
	 WebElement dragItem=driver.findElement(By.cssSelector("div[class*='ui-draggable']"));
	 log.info("Drag Element has been identifed");
	 WebElement dropItem=driver.findElement(By.cssSelector("div[class*='ui-droppable']"));
	 log.info("Drop Element has been identifed");
	 Actions act=new Actions(driver);
	 act.dragAndDrop(dragItem, dropItem).build().perform();
	 log.info("Element has been Dropped");
	 
	 
	 
	  
	 
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
