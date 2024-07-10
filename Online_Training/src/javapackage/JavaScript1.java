package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//Javascript Executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Locate web element using javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
		
		//Scroll down with javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//Scroll Up with javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		

	}

}
