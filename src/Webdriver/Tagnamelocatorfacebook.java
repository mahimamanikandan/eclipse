package Webdriver;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocatorfacebook {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test()
	{
	List<WebElement> li =	driver.findElements(By.tagName("a"));
	System.out.println("link count"+li.size());
	
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		String text=s.getText();
		System.out.println(link+"------"+text);
	}
}
}