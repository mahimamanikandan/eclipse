package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	WebDriver driver;
	By createacc=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstar=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	//By fblogin=By.id("email");
//	By pswd=By.id("pass");
	//By login=By.id("loginbutton");
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(createacc).click();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollby(0, 500)","");
		driver.findElement(getstar).click();
		
		
	}
	

}
