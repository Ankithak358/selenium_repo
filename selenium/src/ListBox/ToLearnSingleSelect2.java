package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect2 {

	private static final Select YearSelect = null;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropdown);
//		daySelect.selectByIndex(9);
//		daySelect.selectByValue("10");
		daySelect.selectByVisibleText("15");
		System.out.println(daySelect.isMultiple());
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("Aug");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelected = new Select(yearDropdown);
		YearSelect.selectByVisibleText("1947");		
		
		
		
	}

	}


