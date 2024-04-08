package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	@Parameters({"url"})
	@Test(groups= {"Smoke"})
	public void SecondTest (String urlName) {
		System.out.println("Bye");
		System.out.println(urlName);
	}

}
