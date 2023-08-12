package javascriptDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//caste driver into javascript executor 
		// to clicking on the webelement
		JavascriptExecutor js =	(JavascriptExecutor )driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.id("APjFqb")));
		
		// for sending the values by using java script executor 
		
		js.executeAsyncScript("document.getElementById('APjFqb').value='Iron Man';");
		
		// To refresh the page by using javscript executor 
		js.executeAsyncScript("history.go(0)");
		
		WebElement srchBox = driver.findElement(By.id("APjFqb"));
		js.executeScript("arguments[0].style.border='2px solid red'", srchBox);
		
		Thread.sleep(10000);
		driver.close();
	}

}
