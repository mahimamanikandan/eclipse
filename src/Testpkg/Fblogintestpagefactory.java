package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpagefactory;

public class Fblogintestpagefactory {
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
	}
	@Test
	public void testlogin()
	{
		Fbloginpagefactory ob=new Fbloginpagefactory(driver);
		ob.setvalues("Mahima","mk23");
		ob.login();
	}

}
