import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorTest {

	public static void main(String[] args) {
		/*Method 1 to invoke chromedriver*/
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path : " + projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.facebook.com/");
		
		//XPATH - //tagName[@attribute='value']
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("glanquist@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Cts@30609");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		//CSS - tagName[attribute='value']
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("glanquist@gmail.com");
//		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Cts@30609");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();

////		regular expressions for XPath, CSS
//		driver.get("https://www.salesforce.com/");
//		
//		driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
//		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("user1");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
//		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
//		driver.get("https://www.rediff.com/");
//		driver.findElement(By.cssSelector("a[title*='Already']")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("username");
//		driver.findElement(By.cssSelector("input[name*='passwd']")).sendKeys("password");
//		driver.findElement(By.cssSelector("[title*='Sign']")).click();
		
		/*Parent-child traverse using xpath*/
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("search me");  // search bar data enter
		driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div[2]/a")).click();   // click images link on homepage
		
	
	
	
	
	
	
	}

}
