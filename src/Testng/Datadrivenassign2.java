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

public class Datadrivenassign2 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException 
	{
		File f=new File("\"C:\\Users\\user\\Desktop\\Book1.xlsx\"");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String uname=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username : "+uname);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password : "+pswd);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uname);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
		
			//login validation
			String acturl=driver.getCurrentUrl();
			System.out.println(acturl);
			String expturl="https://www.facebook.com/";
			if(expturl.equals(acturl))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Login Failed");
			}	
		}
	}
}

