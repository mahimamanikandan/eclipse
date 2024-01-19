package Webdriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookjunit {
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
		driver.findElement(By.id("email")).sendKeys("mk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ma123#");
		driver.findElement(By.name("login")).click();
	}
}
