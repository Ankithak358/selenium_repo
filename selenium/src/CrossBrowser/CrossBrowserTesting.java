package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import graphql.relay.Edge;

public class CrossBrowserTesting {
  
	public WebDriver driver;
	
	@Test
	public void launch(String BroserName)
	{
		if(BroserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BroserName.equals("safari")) {
			driver=new SafariDriver();
		}
		else if(BroserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(BroserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("http://demowebshop.tricients.com/");
		driver.get("http://demowebshop.tricients.com/");
	}

}
