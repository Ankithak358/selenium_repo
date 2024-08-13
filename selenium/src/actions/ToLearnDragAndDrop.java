package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement career = driver.findElement(By.linkText("//iframe[@class='demo-frame lazyloaded]"));
		String photoFrame;
		driver.switchTo().frame((photoFrame));
		
		WebElement WebElementimg1 = driver.findElement(By.xpath("//img[@alt='The peaks of high Tatr"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions avt = new Actions(driver);
		act.scrollByAmount(0,300).perform();
		Object img1;
		act.dragAndDrop(img1,trash).perform();
		Thread.sleep(2000);
		WebElement gallery = driver.findElement(By.id("gallery"));
		act.dragAndDrop(img1,gallery).perform();
		
	
		


	}

}
