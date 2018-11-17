package package2;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Testng3 {
	
	WebDriver driver;
	
	@Test
	  public void f8() throws InterruptedException 
	  {
		driver.navigate().to("http://demo.guru99.com/popup.php");
		Thread.sleep(4000);
		System.out.println("Page Title:"+driver.getTitle());
		WebElement Clicklink=driver.findElement(By.linkText("Click Here"));
		String parentWindow=driver.getWindowHandle();
		System.out.println("parentWindow:"+parentWindow);
		Clicklink.click();
		Thread.sleep(3000);
		Set<String> allWindows= driver.getWindowHandles();
		System.out.println("Total Windows:"+allWindows.size());
		//driver.switchTo().window();
		Iterator< String> itr=allWindows.iterator();
		String childWindow = null;
		while(itr.hasNext())
		{
			 childWindow=itr.next();
		}
		
		driver.switchTo().window(childWindow);
		System.out.println("Page Title:"+driver.getCurrentUrl());
		//Clicklink.click();
		
		driver.findElement(By.name("emailid")).sendKeys("abcde");
		
		driver.switchTo().window(parentWindow);
	  }
  
	
	/*@Test
	  public void f9() throws InterruptedException 
	  {
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[5]/table"));
		List<WebElement> col=driver.findElements(By.xpath("/html/body/div[1]/div[5]/table/thead/tr/th"));
		System.out.println("cols:"+col.size());
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div[1]/div[5]/table/tbody/tr"));
		System.out.println("rows:"+rows.size());
		
		for(int i=0;i<rows.size();i++)
		{
			for (int j=0;j<col.size();j++)
			{
				//table.findElement(by.)
				System.out.println("col val:"+col.get(j).getText());
				System.out.println("---------------------------------------------");
			}
		//}
	  }*/
	@Test
	  public void f10() throws InterruptedException 
	  {
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		System.out.println("Element Clicked");	*/
		
		/*driver.findElement(By.xpath("//input[@name='sex' and @value='Female']")).click();
		System.out.println("Element Clicked");*/
		
		/*driver.findElement(By.xpath("//input[contains(@value,'7')]")).click();
		System.out.println("Radio Clicked");*/
		
		/*driver.findElement(By.xpath("//input[contains(text(),'5')]")).click();
		System.out.println("Radio Clicked");*/
		
		driver.findElement(By.xpath("//input[starts-with(@value,'Selenium Webdriver')]")).click();
		System.out.println("Checkbox Clicked");
		
	  }
	
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium downloads\\Selenium Practice\\geckodriver.exe");
	  System.out.println("Property set");  
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
