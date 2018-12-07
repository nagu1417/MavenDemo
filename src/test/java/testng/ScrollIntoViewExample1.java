package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import org.testng.internal.AbstractParallelWorker.Arguments;

public class ScrollIntoViewExample1 
{

	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

	  Thread.sleep(3000);
	 WebElement textElement=driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[3]"));
	 JavascriptExecutor je= (JavascriptExecutor) driver;
	 je.executeScript("arguments[0].scrollIntoView(true);",textElement);
	 
	 System.out.println("Element Text:"+textElement.getText());
	 
	  
	 
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
