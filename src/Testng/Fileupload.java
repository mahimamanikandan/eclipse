package Testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote--allow--origins=*");
		//driver=new ChromeDriver(options);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test1() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		fileupload("\"C:\\Resume arjun update -1.pdf\"");
	}
	public void fileupload(String p) throws AWTException
	{
		//to copy path to clipboard
		StringSelection strselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		//to paste into syswindow
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);

		
		//Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
