package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of properties file
		File src1 = new File("C:\\Users\\Devyani\\eclipse-workspace\\Selenium_Demo\\Repository_Pnkaj\\config.properties");
		File src2 = new File("C:\\Users\\Devyani\\eclipse-workspace\\Selenium_Demo\\Repository_Pnkaj\\Locators.properties");
		File src3 = new File("C:\\Users\\Devyani\\eclipse-workspace\\Selenium_Demo\\Repository_Pnkaj\\testdata.properties");
		
		//Create FileInputStream Class Object to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		FileInputStream fis3 = new FileInputStream(src3);
		
		//Create Properties class object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));
		
		//getproperty method will accept key and return value of that key
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
