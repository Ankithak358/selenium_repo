package Cars;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghini {
	@Test
	public void launchLamborghini() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://wwww.lamborghini.com/en-en");
		Reporter.log("Lamborghini launched successfully",true);
		
		
	}

}
