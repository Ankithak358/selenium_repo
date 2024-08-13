package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSript1 extends BaseClass {
	@Test
	public void login() {
		
		driver.get()
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login page is not display",true);
				Reporter.log("Login page is displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys("appus123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("appu@")
		
		driver.findElement
		
	} 

}
                                                                                                                                                                                                                                                                                                                                                                                          