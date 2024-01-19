package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;//null
	By Fbname=By.id("email");
	By fbpswd=By.name("pass");
	By login=By.name("login");
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String pswd)
	{
		//driver.navigate().refresh();
		driver.findElement(Fbname).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(pswd);
		
	}
	public void login()
	{
		driver.findElement(login).click();
	}

}
