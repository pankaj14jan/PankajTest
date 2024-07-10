package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Create List - All Companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies: "+ allCompanies.size());
		
		//Create List - Current Price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price count: "+ currentPrice.size());
		
		String expCompName = "One Global Service";
		
		for(int i=0; i<allCompanies.size(); i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(expCompName)) {
				System.out.println(allCompanies.get(i).getText() + " === " + currentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
			}
		}

	}

}
