package Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitprgm {
	@Before
	public void browseropen()
	{
	System.out.println("browseropen");	
	}
	@Test
	public void test()
	{
		System.out.println("Test activity");
	}
	@After
	public void browserclose()
	{
	System.out.println("browserclose");	
	}
}
