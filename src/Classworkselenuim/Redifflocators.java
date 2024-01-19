package Classworkselenuim;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflocators {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a[2]")).click();
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("mahi");
		
	}
}
