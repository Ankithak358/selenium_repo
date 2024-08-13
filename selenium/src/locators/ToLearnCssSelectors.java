package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Value;

public class ToLearnCssSelectors {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector("input[value='search')")).click();

	}

}  
