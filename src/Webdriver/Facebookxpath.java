package Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mk@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("mk@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@After
	public void browserclose()
	{
		//driver.close();
	}

}
