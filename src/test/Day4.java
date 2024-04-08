package test;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLogin() {
		System.out.println("webLoginHome");
	}
	@Test(groups= {"Smoke"})
	public void MoblieLogin() {
		System.out.println("MobileLoginHome");
	}
	@Test(dependsOnMethods= {"webLogin"})
	public void APILogin() {
		System.out.println("APILoginHome");
	}
}
