package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag,drop).build().perform();
		String text=drop.getText();
		if(text.equals("Dropped!"))
		{
			System.out.println("Dropped");
		}
		else
		{
			System.out.println("not expected");
		}
		/*String content=driver.getPageSource();
		if(content.contains("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}*/
	}
}
