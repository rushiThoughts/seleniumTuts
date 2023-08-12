import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataRetrieving {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println(rows);
		// count the columns 
		int columns =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
		System.out.println(columns);
	
		for(int i=2;i<=rows;i++) {
			
			for(int j=1;j<=columns;j++) {
				String values =driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(values +"  ");
			}
			System.out.println();
		}
		
		driver.close();
		
	}

}
