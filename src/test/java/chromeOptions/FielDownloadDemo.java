package chromeOptions;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FielDownloadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		String downloadingPath = System.getProperty("user.dir");
		// set the bahaviour of your chrome browser
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("download.default_directory", downloadingPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=111.0.5563.19/");
		Thread.sleep(2000);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='chromedriver_win32.zip']")));

		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();

		Thread.sleep(2000);

		File f = new File(downloadingPath + "/chromedriver_win32.zip");
		if (f.exists()) {
			System.out.println("file is exist");
			f.delete(); // to delete the file
		}

		driver.close();

	}

}
