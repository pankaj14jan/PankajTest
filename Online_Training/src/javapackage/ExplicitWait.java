package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();// Click on Create Account
	
		//Enter Username
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//Fetch input box attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));//abc@gmail.com
		//Get Height of input box
		System.out.println(driver.findElement(By.id("email")).getSize().getHeight()); 
		//Get width of input box
		System.out.println(driver.findElement(By.id("email")).getSize().getWidth()); 
		
		//Use Explicit wait to check if password field is visible
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("Pass"))).sendKeys("abcd");
	}

}
