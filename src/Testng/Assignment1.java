package Testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		WebElement m=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		m.sendKeys("mobilephones",Keys.ENTER);
		
		String act=driver.getTitle();
		String exp="Amazon.in : mobilephones";
		if(act.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
			
		String parentwindow=driver.getWindowHandle();
	
		WebElement n=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
		n.click();
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);		
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)", "");
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			}
		}
	}
}

