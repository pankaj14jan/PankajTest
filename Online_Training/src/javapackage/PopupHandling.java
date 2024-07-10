package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		// Step 1 - Tab Handling
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();

		// Get total number of open tab/windows
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);

		Iterator<String> abc = allWindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();

		// Print the title of Parent window
		driver.switchTo().window(win1);
		System.out.println("Parent Window Id: " + win1); // Alphanumeric ID of parent window
		System.out.println(driver.getTitle());// Title of Parent window

		// Print the current URL of child tab
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("Parent Window Id: " + win2); // Alphanumeric ID of child window
		System.out.println(driver.getCurrentUrl());// current URL of child tab
		driver.close(); // Close child tab

		// Step 2 - Windows/Popup Handling
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();

		// Print the title of child window
		Set<String> allWindowsID2 = driver.getWindowHandles();
		System.out.println(allWindowsID2);
		Iterator<String> abc1 = allWindowsID2.iterator();
		String win3 = abc1.next();
		String win4 = abc1.next();
		Thread.sleep(2000);
		driver.switchTo().window(win4);
		Thread.sleep(2000);
		System.out.println("Parent Window Id: " + win4); // Alphanumeric ID of child window
		System.out.println(driver.getTitle());// current Title of child Window
		System.out.println(driver.getCurrentUrl());// current URL of child Window
		driver.quit(); // Close Parent window as well as all associated windows
		System.out.println("Windows Popup and Tabs Handled");
	}

}
