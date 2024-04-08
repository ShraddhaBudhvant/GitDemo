package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	@Test
	public void webLogin() {
		System.out.println("webLoginCar");
	}
	@Parameters({"url"})
	@Test(groups= {"Smoke"})
	public void MoblieLogin(String urlName) {
		System.out.println("MobileLoginCar");
		System.out.println(urlName);
	}
	@Test(dependsOnMethods= {"webLogin"})
	public void APILogin() {
		System.out.println("APILoginCar");
	}
}
