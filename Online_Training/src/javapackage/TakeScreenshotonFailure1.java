package javapackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


public class TakeScreenshotonFailure1 {

	WebDriver driver;

	// ITestResult will provide us the Test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			// Create reference of Take Screenshot Interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver; // Typecasting of 2 interfaces

			// Use getScreenshotAs() to capture the screenshot in file format
			// getScreenshotAs() method return type = FILE

			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy to file to specific location
			File destFolder = new File("./Screenshots/" + result.getName() + ".png"); //. is used at project level and 1 folder will be created

			FileUtils.copyFile(sourceFile, destFolder); //Copying files from Source to dest
			System.out.println(result.getName() + "method() Screenshot captured");
		}
	}

}
