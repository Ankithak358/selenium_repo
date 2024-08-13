package webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
//		

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("copare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		
		for(String id:allWindowIds)
			System.out.println(id);
		}

}