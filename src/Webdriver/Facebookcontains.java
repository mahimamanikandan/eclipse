package Webdriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcontains {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() 
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mk@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mah");
		driver.findElement(By.xpath("//*[contains(@id,\"u_0_5\")]")).click();
	}

}
