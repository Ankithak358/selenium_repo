package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.trace.samplers.ParentBasedSamplerBuilder;

public class ToLearnSwitchA1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("copare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
				String url = driver.switchTo().window(id).getCurrentUrl();
				if(!url.contains("shoppersstack")) {
					driver.close();
					
				}
			
		}
	    String parentId = null;
		driver.switchTo().window(parentId);
	    String title = driver.getTitle();
	    System.out.println(title);
			

	}

}
