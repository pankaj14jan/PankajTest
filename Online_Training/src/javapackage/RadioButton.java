package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click(); //Click on Create Account
		
		//1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();//Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();//Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();//Custom
		
		//2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons :" + radios.size());
		System.out.println(radios.get(0).isSelected());//False
		System.out.println(radios.get(1).isEnabled());//True
		System.out.println(radios.get(2).isDisplayed());//True
		System.out.println(radios.get(2).isSelected());//true
		
		Thread.sleep(2000);
		radios.get(1).click();//Male
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected());//false
		
		//3rd way - By clicking text we can also select radio buttons
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio Buttons Text :" + radios1.size());
		String expResult = "Female";
		
		for(int i=0; i<radios1.size(); i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(expResult)) {
				radios1.get(i).click();
				System.out.println(expResult + " Clicked ");
				break;
			}
		}
		
	}

}
