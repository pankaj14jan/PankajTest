package javapackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devyani\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//switching frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");
		
		//Draggable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//Drag and drop using Actions class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 100, 60).build().perform();
		
		//Drag the web element and click and hold using coordinates
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();
		

	}

}
