package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPoPUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricient.com");
		driver.findElement(By.xpath("/input[@value='search']"));
		
		Alert aleartPopAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		String popupMsg = alertPopup.getText();
		System.out.println(popupMsg);
		alertPopup.accept();
		

	}

}
