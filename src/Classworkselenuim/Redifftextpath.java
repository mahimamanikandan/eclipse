package Classworkselenuim;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextpath {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
	}
	@Test()
	public void test()
	{
	driver.findElement(By.xpath("//div[@class=\"create-new-account\"]/a/u")).click();
	WebElement s=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String expectedresult="Create my account >>";
		String text=s.getAttribute("value");
		if( text.equals(expectedresult))
				{
			System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
	}
}
