package AuthenticationDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthonticationDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		 * Syntax to handle the Basic Authentication by using the modifying the url 
		 * http://UserName:Password@url  
		 */
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
