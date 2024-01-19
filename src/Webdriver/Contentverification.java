package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contentverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String content=driver.getPageSource();
		if(content.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}
}
