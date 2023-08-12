package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// By using Select class we can handle this dropdown
		Select dropdown =new Select(staticDrop);
		dropdown.selectByIndex(3);
		String option1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(option1);
		
		dropdown.selectByValue("INR");
		String option2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(option2);
		
		dropdown.selectByVisibleText("AED");
		String option3=dropdown.getFirstSelectedOption().getText();
		System.out.println(option3);
			driver.close();
	}

}
