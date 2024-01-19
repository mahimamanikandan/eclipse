package Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlejunit {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedresult="Google";
		if(actualtitle.equals(expectedresult))
		{
		System.out.println("Pass");
		}
		else
		{
		System.out.println("Fail");
		}

	}
	@After
	public void browserclose()
	{
		driver.quit();
	}

}
