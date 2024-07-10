package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		

		// Create Electronics Web element Ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse Simulation using Actions Class
		Actions act = new Actions(driver);

		// Mouse hover to Electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();

		// Keyboard Operation
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked");

		// Right Click on Web page
		Thread.sleep(2000);
		act.contextClick().build().perform();

	}

}
