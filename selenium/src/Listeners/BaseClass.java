package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass{
	public static WebDriver driver;
	@BeforeClass
	public void launch() {
		driver=new ChromeDriver();
	}

}
