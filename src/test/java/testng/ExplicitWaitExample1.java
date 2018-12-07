package testng;

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

public class ExplicitWaitExample1 
{

	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

	  WebElement dragItem=driver.findElement(By.cssSelector("div[class*='ui-draggable']"));
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='ui-draggable']")));
	  
	 
	 WebElement dropItem=driver.findElement(By.cssSelector("div[class*='ui-droppable']"));
	 Actions act=new Actions(driver);
	 act.dragAndDrop(dragItem, dropItem).build().perform();
	 
	 
	 
	  
	 
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
