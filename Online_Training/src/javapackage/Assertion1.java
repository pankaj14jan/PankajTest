package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	@Test
	public void TestCase1() {

		String expectedText = "Facebook helps you connect and share with the people in your life.";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		String ActualText = driver.findElement(By.xpath("//h2[contains(text(),'life')]")).getText();

		// Equal Assertion
		Assert.assertEquals(ActualText, expectedText);
		System.out.println("Equal Assertion Passed");

		// False Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life')]")).isSelected());
		System.out.println("False Assertion Verified");

		// True Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life')]")).isDisplayed());
		System.out.println("True Assertion Verified");
	}
}
