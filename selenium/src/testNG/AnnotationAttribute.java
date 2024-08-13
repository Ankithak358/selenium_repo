package testNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(priority = 2,invocationCount = 4,threadPoolSize = 4)
	Public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().
	
		
		
	}
	

}
