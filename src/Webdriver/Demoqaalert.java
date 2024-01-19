package Webdriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqaalert {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	@Test
	public void alert1() {
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert a=driver.switchTo().alert();
		String ac=a.getText();
		if(ac.equals("You clicked a button"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
		
	}
	@Test
	public void alert2()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a1=driver.switchTo().alert();
		String ac1=a1.getText();
		if(ac1.equals("Do you confirm action?"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a1.dismiss();
	}

}
