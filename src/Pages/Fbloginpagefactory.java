package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpagefactory {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpasswrd;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	public Fbloginpagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpasswrd.sendKeys(password);
	}
	public void login()
	{
		fblogin.click();
	}

}
