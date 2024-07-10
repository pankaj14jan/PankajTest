package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();// Click on Create Account
		Thread.sleep(2000);

		// 1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//Select[@id='month']/option"));
		System.out.println("Total Dropdown Values :" + birthMonth.size());
		birthMonth.get(8).click(); // Sep

		// 2nd way
		WebElement bm = driver.findElement(By.xpath("//Select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");// Apr
		Thread.sleep(2000);
		month.selectByValue("12");// Dec
		Thread.sleep(2000);
		month.selectByIndex(7); // Aug
		System.out.println(month.getFirstSelectedOption().getText()); //Aug - Current selected value
		
		//3rd way
		List<WebElement> dropdown = month.getOptions();
		for (int i=0; i<dropdown.size(); i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
				System.out.println("September is clicked");
			}
		}
		
		//4th Way
		bm.sendKeys("Jun");
		System.out.println("June is selected");
		
		//5th way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Select[@id='month']")).sendKeys("Mar");
		System.out.println("March is selected");

		//check if dropdown supports multi selection
		System.out.println(month.isMultiple()); //False
		month.selectByVisibleText("Apr");
		month.selectByValue("12"); //Dec
		month.selectByIndex(7); //Aug
		
		//Deselect the multi selected values from dropdown
		month.deselectByVisibleText("Apr");
		month.deselectByValue("12"); //Dec
		month.deselectByIndex(7); //Aug
		month.deselectAll(); //Deselect all selected dropdown values
 		
	}

}
