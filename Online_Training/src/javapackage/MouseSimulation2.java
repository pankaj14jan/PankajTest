package javapackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//switching frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");
		
		//Draggable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//Droopable web element
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Drag and drop using Actions class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		

	}

}
