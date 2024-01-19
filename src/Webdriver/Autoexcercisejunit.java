package Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoexcercisejunit {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("user-name")).sendKeys("mahima");
		driver.findElement(By.id("password")).sendKeys("mk@12");
		driver.findElement(By.name("login-button")).click();
	}
	@After
	public void browserclose()
	{
		driver.close();
	}
}
