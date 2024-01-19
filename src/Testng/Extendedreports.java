package Testng;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendedreports {
	WebDriver driver;
	
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		//reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		reporter=new ExtentHtmlReporter("./Report/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("HostName", "Rakhy");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("TesterName", "Mahima");
		extent.setSystemInfo("Browser Name", "Chrome");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("Fb Title Verification");
		String Exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp,actual);
		
	}
	
	@Test
	public void fbbuttontest()
	{
		test=extent.createTest("Fb Button Test");
		String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_5_E9\"]")).getText();
		Assert.assertEquals(buttontext,"register");
	}
	@Test
	public void fblogotest()
	{
		test=extent.createTest("Fb Logo Test");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
		
			@AfterMethod
			public void browseropen(ITestResult result) throws IOException
			{
				if(result.getStatus()==ITestResult.FAILURE)
				{
					test.log(Status.FAIL,"test case failed is"+result.getName());
					test.log(Status.FAIL,"test case failed is"+result.getThrowable());
					String screenshotpath=Extendedreports.screenshotMethod(driver,result.getName());
					test.addScreenCaptureFromPath(screenshotpath);
				}
				else if(result.getStatus()==ITestResult.SKIP)
				{
					test.log(Status.SKIP,"Test case skipped is"+result.getTestName());
				}
				else if(result.getStatus()==ITestResult.SUCCESS)
				{
					test.log(Status.PASS,"Test case Passed is"+result.getStatus());
				}
			}
			public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
			{
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String destination="./Screenshot/"+screenshotname+".png";
				FileHandler.copy(src, new File(destination));
				return destination;
				
			}
}
