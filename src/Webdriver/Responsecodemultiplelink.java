package Webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodemultiplelink {
	ChromeDriver driver;
	//String baseurl="https://www.google.com/";
	@Before
	public void set()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void linkcount() 
		{
		driver.get("https://www.google.com/");
		List<WebElement> li =driver.findElements(By.tagName("a"));
		//System.out.println("link count"+li.size());
		System.out.println("total no of links="+li.size());
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			verify(link);
			//String text=s.getText();
			//System.out.println(link+"------"+text);
			//verify(link,text);
		}
		}
	private void verify(String link) {
		// TODO Auto-generated method stub
		try
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			//HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				//System.out.println("VALID---"+text+link);
				System.out.println("valid---"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken link---"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
