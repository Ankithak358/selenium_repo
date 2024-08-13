package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("copare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (url.contains("amazon"));
			driver.close();
			Thread.sleep(1000);
		}

	}

}
