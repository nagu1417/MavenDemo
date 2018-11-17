package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	WebDriver driver;
	
	//WebDriver driver=new FirefoxDriver();
  @Test(priority=1)
  public void f() throws InterruptedException 
  {
	  driver.get("https://accounts.google.com/");
	  Thread.sleep(4000);
	  WebElement username=driver.findElement(By.xpath("//*[@id='identifierId']"));
	  username.sendKeys("nagesh1417@gmail.com");
	  Thread.sleep(4000);
	  WebElement nextButton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span"));
	  nextButton.click();
	  Thread.sleep(3000);
	  System.out.println("In Gmail Accounts Test");
  }
  
  @Test(priority=0)
  public void f2()
  {
	System.out.println("In Test Method f2");  
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();
  }
  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }
  
  
  
}
