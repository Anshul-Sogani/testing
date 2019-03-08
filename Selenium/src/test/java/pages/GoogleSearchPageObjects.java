package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	By textbox_Search = By.name("q");
	By button_Search = By.name("q");
	WebDriver driver;
	
	// for setting up the driver from the calling class
	
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_Search).sendKeys(text);
	}
	public void clickSearchBtn() {
		driver.findElement(button_Search).sendKeys(Keys.ENTER);
	}


}


