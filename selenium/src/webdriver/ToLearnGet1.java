package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().setPosition(new Point(150,70));
		

		

	}

}
