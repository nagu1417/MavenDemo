package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng4 {
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.google.com/");

	  Thread.sleep(3000);
	  WebElement searchElement=driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
	  searchElement.sendKeys("nag");
	  Thread.sleep(7000);
	  System.out.println("Value set");
	  String s2=searchElement.getAttribute("value");
	  System.out.println("s2:"+s2);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();
	  /*System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  System.out.println("Property set");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();*/
	  
	  WebDriverWait wait=new WebDriverWait(driver, 20);
  }
  
  @AfterTest
  public void afterTest() {
	 // driver.close();
  }
}
