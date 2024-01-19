package Classworkselenuim;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpage {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void display()
	{
		Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Boolean b1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(b1)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("not displayed ");
		}
		Boolean b2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
		if(b2)
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
	}
}
