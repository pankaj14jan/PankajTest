package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Works");

		// Handling Auto Suggestions
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		for (int i = 0; i < AllSuggestions.size(); i++) {
			String expResult = "how stuff works quiz";
			if (AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
				AllSuggestions.get(i).click();
				break;
			}
		}

	}

}
