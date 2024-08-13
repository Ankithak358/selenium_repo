package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.IoException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotOfWebElement {

	public static void main(String[] args)throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		File temp = driver.findElement(By.xpath("//img[@alt='Tricents Demo web Shop']")).getScreenshotAs("OutPutType.fILE")); name = new (););
        File dest =new File("./screenshots/elementImage.png");
        FileHandler.copy(temp,dest);
            
   		  
		 


	}

}
