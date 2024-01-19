package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbcreatepage;

public class Fbcreatetest {
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
	public void test()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.setvalues();
	}
	
}
