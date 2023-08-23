package dateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateParsingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String month = "July";
		String year ="2024";
		String date = "26";
		WebDriverManager.edgedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Thread.sleep(5000);
		WebElement dateDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div #datepicker1")));
		dateDropdown.click();
		Thread.sleep(5000);
		String title = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		String monthTitle= title.split(" ")[0].trim();
		System.out.println(title);
		System.out.println(monthTitle);
		String yearTitle = title.split(" ")[1].trim();
		System.out.println(yearTitle);
		
		while(!(monthTitle.equalsIgnoreCase(month) && yearTitle.equalsIgnoreCase(year))) {
			driver.findElement(By.cssSelector("[data-handler='next']")).click();
			 title = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		driver.close();
		driver.close();
	}
}
