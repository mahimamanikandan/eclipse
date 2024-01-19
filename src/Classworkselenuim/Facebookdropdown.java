package Classworkselenuim;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void test()
	{
		WebElement days=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select da=new Select(days);
		da.selectByValue("13");
		WebElement months=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select mo=new Select(months);
		mo.selectByVisibleText("Jan");
		WebElement years=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select ye=new Select(years);
		ye.selectByValue("1998");
		List<WebElement> d = da.getOptions();
		System.out.println(d.size());
		List<WebElement> m=mo.getOptions();
		System.out.println(m.size()); 
		List<WebElement> y = ye.getOptions();
		System.out.println(y.size());
	}

}
