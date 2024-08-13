package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners( ListenerImlementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("Open Broser",true);
		Reporter.log("Navigate to url",true);
		Reporter.log("Click on login link",true);
		Reporter.log("Enter email",true);
		Reporter.log("Enter password",true);
		Reporter.log("Click on login button",true);
		Assert.assertEquals(true, false);
		
		
	}
	
}

