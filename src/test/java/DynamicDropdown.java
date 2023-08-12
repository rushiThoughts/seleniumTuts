import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("testing");
		List <WebElement> allSuggestions= driver.findElements(By.cssSelector("ul[role='listbox'] li"));
		for(WebElement option:allSuggestions) {
			;
			System.out.println(option.getText());
		}
	}

}
