package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Swaglabassign3 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void login() throws IOException 
	{
		File f= new File("D:\\swaglabs.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("User name : "+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password : "+pswd);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.navigate().refresh();
			
			String acturl=driver.getCurrentUrl();
			String expurl="https://www.saucedemo.com/v1/inventory.html";
			if(expurl.equals(acturl))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("lofin failed");
			}
		}
	}
}


