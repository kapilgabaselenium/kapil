package pkg1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException 
	{
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\galaxy\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebElement login=driver.findElement(By.id("abv"));
		WebDriverWait ws=new WebDriverWait(driver, 5);
		ws.until(ExpectedConditions.visibilityOf(login));
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	  
		
	}

}
