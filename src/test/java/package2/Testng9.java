package package2;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Testng9 {
	WebDriver driver;
	

	@Test
	public void f4() throws Exception
	{
		System.out.println("In Test 1"); 
	 }	
	@Test
	public void f5() throws Exception
	{
		System.out.println("In Test 2"); 
	 }
	@Test
	public void f6() throws Exception
	{
		System.out.println("In Test 3"); 
	 }
	@Test
	public void f7() throws Exception
	{
		System.out.println("In Test 4"); 
	 }
	@Test
	public void f8() throws Exception
	{
		System.out.println("In Test 5"); 
	 }
	@Test
	public void f9() throws Exception
	{
		System.out.println("In Test 6"); 
	 }
  @BeforeTest
  public void beforeTest() 
  {
	 System.out.println("Starting");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Ending");
	  
  }

}
