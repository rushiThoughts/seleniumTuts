package Miscellenous;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFileByRobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {


		WebDriverManager.edgedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement UploadButon = driver.findElement(By.id("uploadfile_0"));
	//	UploadButon.sendKeys("C:\\Users\\Rushi\\Downloads\\Selenium Notes (2).docx");
//		UploadButon.click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(UploadButon).click().perform();
		
		Robot robot = new Robot();
		robot.delay(2000);
		
		StringSelection s = new StringSelection("C:\\Users\\Rushi\\Downloads\\Selenium Notes (2).docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
