package package1;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Testng2 {
	WebDriver driver;
	WebDriverWait wait;
 /* @Test
  public void f() throws InterruptedException {
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  //Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continents']")));
	  
	  Select continents=new Select(driver.findElement(By.xpath("//*[@id='continents']")));
	  //To get first selected value and print it 
	  String s=continents.getFirstSelectedOption().getText();
	  System.out.println(s);
	  
	  //To find all values in dropdown
	  WebElement dropdown=driver.findElement(By.xpath("//*[@id='continents']"));
	  List<WebElement> droplist=dropdown.findElements(By.tagName("option"));
	  for(int i=0;i<droplist.size();i++)
	  {
		  System.out.println("Dropdown Values:"+droplist.get(i).getText());
	  }
	  
	  //To Select particular value from Drop down
	  //continents.selectByIndex(2);
	  Thread.sleep(2000);
	  continents.selectByVisibleText("Africa");
	  Thread.sleep(2000);
	  
	  for (WebElement webElement : i) {
		  System.out.println("i:"+i.get(0).getAttribute("name"));
		
	}
  }*/
  
  
  @Test
  public void f4() throws InterruptedException, IOException {
	  driver.get("file:///C:/Users/Nagesh/Desktop/FileUpload.html");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='1']")).click();
	  //driver.findElement(By.xpath("//input[@type='file']")).click();
	  
	  Runtime.getRuntime().exec("F:\\AutoItScripts\\FileUpload1.exe");
	 
  }
  
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();
	  wait = new WebDriverWait(driver,30);
  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
