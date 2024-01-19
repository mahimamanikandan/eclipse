package Classworkselenuim;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		//driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.xpath("//div[@id=\"nav-tools\"]/a[2]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("mk@hmail.com",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
	}
}
