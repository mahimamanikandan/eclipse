package Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazontitlejunit {
EdgeDriver driver;

         @Before
          public void browseropen()
          {
        		driver=new EdgeDriver();
        		driver.get("https://www.amazon.in/");
          }
         @Test
         public void test()
         {
        	 String actualtitle=driver.getTitle();
        	 System.out.println(actualtitle);
         }
         @After
         public void browserclose()
         {
        	 driver.quit();
         }
}
