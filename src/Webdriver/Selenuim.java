package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenuim 

{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedresult="Google";
		if (actualtitle.equals(expectedresult))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		driver.close();
	}
}
