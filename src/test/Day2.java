package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
	@Test(dataProvider="getData")
	public void exDataPro(String username, String Password) {
		
		System.out.println("Data Provider Example");
		System.out.println(username);
		System.out.println(Password);
	}
	
	@Test
	public void ThirdTest() {
		System.out.println("Good");
		
	}
	
	@DataProvider 
	public Object[][] getData() {
		
		// 3 Combination of username password
		// every time it will take a know data
		
		Object[][] data= new Object[3][2];
		
		//1 set
		data [0][0]= "FirstUsername";
		data [0][1]= "FirstPassword";
		
		//2nd set
		data [1][0]="SecondUsername";
		data [1][1]="SecondPassword";
		
		//3rd set
		data [2][0]="ThirdUsername";
		data [2][1]="ThirdPassword";
		
		return data;
				
	}
}
