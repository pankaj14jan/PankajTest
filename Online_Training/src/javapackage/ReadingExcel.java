package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("C:\\Users\\Devyani\\Desktop\\Selenium\\Online_Training.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

	}

}
