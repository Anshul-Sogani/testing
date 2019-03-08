package test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;


public class GoogleSearchModelTest {
	
		
 static WebDriver driver;
	
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
	}
	
	public static void action() {
		
		driver.get("http://google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("anshul");
		
		GoogleSearchPage.click(driver).sendKeys(Keys.ENTER);
		driver.close();
		
		
	}
	
	public static void main(String[] args) {
		
		setup();
		action();
		
	}

}
