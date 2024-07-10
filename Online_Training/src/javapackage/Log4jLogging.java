package javapackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		
		//Create logger instance
		
		Logger logger = Logger.getLogger("Log4jLogging");
		
		//configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\Devyani\\eclipse-workspace\\Selenium_Demo\\Repository_Pnkaj\\log4j.properties");
		
		//Open Browser Instance
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Browser Instance opened");
		
		//Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");
		
		//Open URL
		driver.get("https://www.facebook.com/");
		logger.info("Application Opened");
		
		//Check if the web element is displayed or not?
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("'emails' Web Element Displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("Failure - 'emails' web element is not displayed");
		}
		
				
	}
}