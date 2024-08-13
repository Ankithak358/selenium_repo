package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImlementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test script is failed",true);
	}
	
	
	
	

}
