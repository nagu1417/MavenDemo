package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample1 
{

	WebDriver driver;
	
	
  
  
  @Test
  @Parameters("Browser")
  public void beforeTest(String browser) throws Exception {
	  if(browser.equalsIgnoreCase("FF"))
	  {
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("Chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  }
	  driver.get("http://demo.guru99.com/test/newtours/register.php");

	  Thread.sleep(3000);
	  WebElement countryElement=driver.findElement(By.xpath("//select[@name='country']"));
	  Select s=new Select(countryElement);
	  s.selectByVisibleText("INDIA");
	  
	  
	  driver.manage().window().maximize();
	  
	  WebDriverWait wait=new WebDriverWait(driver, 20);
  }
  
  @AfterTest
  public void afterTest() {
	 // driver.close();
  }


}
