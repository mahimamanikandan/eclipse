package Webdriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void alertbox1()
	{
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Documents/alert.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/htm/input[1]")).click();
		//driver.switchTo().alert().accept();
		Alert act=driver.switchTo().alert();
		String acttext=act.getText();
		if(acttext.equals("Hello!I am an alert box!!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		act.accept();
		driver.findElement(By.xpath("/html/body/htm/input[2]")).sendKeys("Mahima");
		driver.findElement(By.xpath("/html/body/htm/input[3]")).sendKeys("K");
		driver.findElement(By.xpath("/html/body/htm/input[4]")).click();

	}

}
