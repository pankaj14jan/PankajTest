package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();// Click on Sign In

		// Find the total number of frames present
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frame: " + allFrames);

		// Go Inside each frame and check if the element is present
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//*[contains(text()='Watch Video']")).click();
			driver.findElement(By.xpath("//a[@oauth-id='qrPrivacyPolicy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text()='close']")).click();
		}

	}

}
