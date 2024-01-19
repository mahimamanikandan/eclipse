package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngfeatures1 {
	@BeforeTest
	public void browseropen()
	{
		System.out.println("browseropen");
	}
	@BeforeMethod
	public void urlopen()
	{
		System.out.println("urlopen");
	}
	@Test(priority=3,dependsOnMethods= {"test2"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=2,invocationCount=2)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=1,enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("Report");
	}
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}
}
