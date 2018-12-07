package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample1 
{

	WebDriver driver;
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	
  @Test(dataProvider="testData")
  public void f(String UName,String pass) throws InterruptedException 
  {
	  driver.get("https://www.facebook.com");

	  Thread.sleep(3000);
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	  WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
	  email.sendKeys(UName);
	  password.sendKeys(pass);
	  loginButton.click();
	 
  }
  @BeforeTest
  public void beforeTest() 
  {
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
  public void afterTest() 
  {
	 // driver.close();
  }


@DataProvider(name="testData")
public Object[][] test() throws Exception
{
	String str[][]=null;
	File fi=new File("C:\\Users\\Nagesh\\Desktop\\Test1.xlsx");
	FileInputStream fis=new FileInputStream(fi);
	workBook=new XSSFWorkbook(fis);
	sheet=workBook.getSheet("Sheet1");
	int intRow=sheet.getLastRowNum()-sheet.getFirstRowNum();
	System.out.println("RowCount:"+intRow);
	int imtcolumn=sheet.getRow(1).getLastCellNum();
	System.out.println("Column Count:"+imtcolumn);
	for(int i=0;i<intRow;i++)
	{
		str[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		
		str[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Cell values are :"+str[i][0]+" and "+str[i][1]);
	}
	return str;
}
}


