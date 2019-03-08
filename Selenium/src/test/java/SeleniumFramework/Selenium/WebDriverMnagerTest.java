package SeleniumFramework.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMnagerTest {
	
	
	
	public void setupBrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		
	}
	
	public void setupTest() {
		
		/*WebDriver driver = new FirefoxDriver();*/
		/*WebDriver d = new InternetExplorerDriver();*/
		WebDriver d = new EdgeDriver();
		
		d.get("http://google.com");
		d.close();
		
	}
	
	/*public void close() {
		 
		driver.close();
		
	}*/
	
	
	public static void main(String[] args) {
		
		WebDriverMnagerTest test = new WebDriverMnagerTest();
		test.setupBrowser();
		test.setupTest();
		
		
		
	}

}
