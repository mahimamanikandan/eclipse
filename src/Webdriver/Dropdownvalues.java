package Webdriver;

import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvalues {
	
ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test()
	public void test()
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement) ;
		day.selectByValue("05");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select m=new Select(month);
		m.selectByIndex(3);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select y=new Select(year);
		y.selectByVisibleText("1995");
		List<WebElement> d = day.getOptions();
		System.out.println(d.size());
		List<WebElement> mo=m.getOptions();
		System.out.println(mo.size()); 
		List<WebElement> ye = y.getOptions();
		System.out.println(ye.size());
	}
	
}

