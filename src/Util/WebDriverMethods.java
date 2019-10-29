package Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethods {

	public WebDriver driver;

	//Proper pageload/waittime

	public void maxscreen() {
		driver.manage().window().maximize(); // maximize the browser
	}

	public void deletecookies() {
		driver.manage().deleteAllCookies(); //delete all cookies
	}

	public void waitTime() { //implicitwaittime
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void pageload() { // time to load the page contents.
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	//All Clicks
	public void ClickByXpath(String Locator) {
		driver.findElement(By.xpath(Locator)).click();
	}
	
	public void ClickById(String Locator) {
		driver.findElement(By.id(Locator)).click();
	}
	
	public void ClickByCSS(String Locator) {
		driver.findElement(By.cssSelector(Locator)).click();
	}
	//All Types/input
	public void TypeByXpath(String Locator , String Value) {
		driver.findElement(By.xpath(Locator)).sendKeys(Value);
	}
	public void TypeById(String Locator, String Value) {
		driver.findElement(By.id(Locator)).sendKeys(Value);
	}
	//Web Elements
	
	public void SelectCountryCode(String Value) { //select conutry code
	WebElement W1 =	driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
	Select S1 = new Select(W1);
	S1.selectByValue(Value);
		
	}
	
	public void SelectMonth(String Value) {
		WebElement 	W2 = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
		Select S2 = new Select(W2);
		S2.selectByValue(Value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
