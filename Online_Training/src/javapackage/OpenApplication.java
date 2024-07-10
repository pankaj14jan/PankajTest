package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.ChromeDriverManager;

public class OpenApplication {

	public static void main(String[] args) {

		// WebdriverManager.chromedriver().setup(); //requires Maven dependency but dont
		// require chromedriver exe (it willtake it online)

		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");

		// Launching Chrome browser instance
		WebDriver driver = new ChromeDriver();

		// we are opening URL using get method
		driver.get("https://www.facebook.com");

		// Maximize the window
		driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Open URL using Navigate() method
		driver.navigate().to("https://www.google.com");

		// Refresh the page
		driver.navigate().refresh();

		// Navigate to back
		driver.navigate().back(); //Facebook should open

		// Navigate to forward
		driver.navigate().forward(); //Google should open
		
		//fetch current URL
		System.out.println(driver.getCurrentUrl());
		
		//Get Title of the web page
		System.out.println(driver.getTitle());
		
		//Close the browser instance
		driver.close();

	}

}
