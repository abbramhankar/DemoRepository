import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws Exception {
		
		/*Method 1 to invoke chromedriver*/
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path : " + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");	
		
		/*Method 2 to invoke chromedriver using WebDriverManager*/
		/*This can be used instead of the 3 steps above*/
		
//		WebDriverManager.chromedriver().driverVersion("3.141.59").setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com/");
		
		WebElement we = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
				we.sendKeys("Automation step by step");
		Thread.sleep(3000);
	
		driver.close();
		

	}

}
