package package1;


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
	/* @Test
  public void f() throws InterruptedException 
  {
	  driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='alert']")).click();
	  Thread.sleep(3000);
	  Alert alert=driver.switchTo().alert();
	 // alert.accept();
	  System.out.println(alert.getText());
	  alert.dismiss();
  }*/
  
  /*@Test
  public void f2() throws InterruptedException 
  {
	  driver.navigate().to("file:///F:/basic2.html");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr[2]/td/button")).click();
	  Thread.sleep(2000);
	  Alert alert=driver.switchTo().alert();
	  System.out.println(alert.getText());
	  alert.dismiss();
	  
  }*/
  /*@Test
  public void f3() throws InterruptedException 
  {
	  driver.get("http://demo.guru99.com/selenium/newtours/register.php");
	  Thread.sleep(5000);
	  WebElement dropDown=driver.findElement(By.name("country"));
	  Select s=new Select(dropDown);
	  System.out.println(s.isMultiple());
	  s.selectByVisibleText("INDIA");
	  List<WebElement> s2=dropDown.findElements(By.tagName("option"));
	  for (WebElement webElement : s2) {
		  System.out.println(webElement.getAttribute("value"));
		
	}
	  
  }*/
  
 /* @Test
  public void f4() throws InterruptedException 
  {
	  driver.get("http://demo.guru99.com/selenium/newtours/");
	  Thread.sleep(5000);
	  WebElement HomeLink=driver.findElement(By.linkText("Home"));
	  WebElement td_Home=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
	  
	  Actions act=new Actions(driver);
	  String bgcolor=td_Home.getCssValue("background-color");
	  //HomeLink.getAttribute("bgcolor");
	  System.out.println("bgcolor before mouse hover:"+bgcolor);
	  Thread.sleep(3000);
	  Action element=act.moveToElement(HomeLink).build();
	  element.perform();
	  
	  String bgcolor2=td_Home.getCssValue("background-color");
	  System.out.println("bgcolor before mouse hover:"+bgcolor2);
	  
	  
  }*/
	/*@Test
	  public void f5() throws InterruptedException 
	  {
		driver.get("http://demoqa.com/");
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[1]/a"));
		WebElement target=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside[2]/div[2]/div/ul/li[2]/a"));
		act.dragAndDrop(source,target).build().perform();
		
	  }*/
	
	/*@Test
	  public void f6() throws InterruptedException 
	  {
		driver.navigate().to("http://demo.guru99.com/selenium/upload/");
		Thread.sleep(6000);
		WebElement Uploadbox=driver.findElement(By.className("upload_txt"));
		Uploadbox.sendKeys("C:\\Users\\Nagesh\\Downloads\\waterfall.jpg");
		
	  }*/
	
	/*@Test
	  public void f7() throws InterruptedException 
	  {
		driver.navigate().to("http://demoqa.com/datepicker/");
		Thread.sleep(4000);
		WebElement datebox=driver.findElement(By.id("datepicker1"));
		//datebox.click();
		datebox.sendKeys("October 3, 2017");
	  }
	*/
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
	 // driver.close();
  }

}
