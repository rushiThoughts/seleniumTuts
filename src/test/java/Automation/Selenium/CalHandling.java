package Automation.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep"))));
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
		int allDates = driver.findElements(By.className("css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu")).size();
		
		for(int i=0;i<allDates;i++) {
			
			driver.findElement(By.className("css-76zvg2 r-jwli3a r-ubezar r-16dba41")).click();
		}

	}

}
