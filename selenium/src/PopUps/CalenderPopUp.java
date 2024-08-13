package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/ull");
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()=August 2024']/../..//p[text()='august 2024']"));
		
		String month="october";
		int year = 2004;
		int date = 20;
		
		while(true) {
		try {
			driver.findElement(By.xpath("div[text()='December 2024']/../..//p[text()='15']")).click();
		break;
		}catch(Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}
		}
	}
}
		
		
			
		
	


