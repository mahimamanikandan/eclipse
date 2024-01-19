package Classworkselenuim;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaylocators {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	}
	@Test
	public void test()
	{
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		String Expectedresult="ebay.com";
		if(Actualtitle.equals(Expectedresult))
		{
			System.out.println("title is ebay.com");
		}	
		else
		{
		System.out.println("title is not ebay.com");
		}
		driver.findElement(By.id("gh-shop-a")).click();
		driver.findElement(By.xpath("//table[@id=\"gh-sbc\"]/tbody/tr/td/ul/li[4]/a")).click();
		String content=driver.getPageSource();
		if (content.contains(content))
		{
			System.out.println("Page contains shop by category");
		}
		else
		{
			System.out.println("Page not contains shop by category");
		}
		driver.findElement(By.xpath("//div[@class=\"dialog__cell\"]/section/ul/li/a")).click();
		driver.findElement(By.className("gh-cart-icon")).click();
		driver.findElement(By.xpath("//div[@class=\"actions multi-actions\"]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"gh-ac-box2\"]/input")).sendKeys("books",Keys.ENTER);
	}
}
