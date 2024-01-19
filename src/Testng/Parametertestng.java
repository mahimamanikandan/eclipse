package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertestng {
	@Parameters("b")
	@Test
	public void parameter(String g)
	{
		System.out.println("value is="+g);
	}
}
