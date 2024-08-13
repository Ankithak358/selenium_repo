package Cars;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Rangerover {
	@Test
	public void launchRangerover() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.landrover.com/range-rover/index.html");
		Reporter.log("Rangerover launched successfully");
	
	}
}

	


