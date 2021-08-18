import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Method 1 to invoke chromedriver*/
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path : " + projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		
		//System.out.println(dropdown.);
		
		
		
	}

}
