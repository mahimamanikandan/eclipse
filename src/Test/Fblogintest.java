package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class Fblogintest {
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
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("mk@gmail.com", "mak@12");
		ob.login();
	}

}
