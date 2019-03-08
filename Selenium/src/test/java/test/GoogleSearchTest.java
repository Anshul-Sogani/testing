package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	public static void search() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");
	
	
	//Enter the name in text box
	
	driver.findElement(By.name("q")).sendKeys("Anshul Sogani");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
	driver.close();
	
	System.out.println("test completed sucessfully!");
	

}
	
	public static void main(String[] args) {
		search() ;
	}
	
	
}