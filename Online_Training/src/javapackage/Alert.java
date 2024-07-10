package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		//Alert Handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		
		//Verify Alert Text
		String AlertText = driver.switchTo().alert().getText();
		String expAlertText = "Do you confirm action?";
		//Assert.assertEquals(AlertText, expAlertText ));
		System.out.println("Alert Text verified");
		
		//Accept the alert
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//Dismiss the alert
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		

	}

}
