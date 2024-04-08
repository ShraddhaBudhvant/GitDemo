package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements  ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		    // not implemented
		
		  }
	
	@Override
	public void onTestSuccess(ITestResult result) {
		    // not implemented
		System.out.println("I will execute when test passes ");
		
		  }
	
	@Override
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		// screen shot code
		// print response code when API fails
		System.out.println("I will execute when test failed ");
		  }
	
	@Override
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }
	
	@Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }
	
	@Override
	 public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
	  }
	
	
	@Override
	 public void onFinish(ITestContext context) {
		    // not implemented
	  }
	 
}
