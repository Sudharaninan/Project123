package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Allpages.loginpage;

public class firstprogram  extends loginpage{

	public static void main(String[] args) throws IOException
	{
		String emailid = "";

		String password = "";



		String path = "D:\\Testdata.xlsx";



		FileInputStream fs = new FileInputStream(path);



		XSSFWorkbook workbook = new XSSFWorkbook(fs);



		XSSFSheet sheet = workbook.getSheet("testdata");



		// Identify how many no.of rows are there in the sheet

		int rows = sheet.getLastRowNum();



		for (int i = 1; i <= rows; i++) {



		// Get the values from the sheet

		XSSFRow row = sheet.getRow(i);



		emailid = row.getCell(0).getStringCellValue();



		password = row.getCell(1).getStringCellValue();

		application_lanuch(brower,url);
		InputEMail(emailid);
		Inputpassword(password);
		Button_login();
		application_close();
;
		 String actual=driver.findElement(By.xpath("//h2")).getText();

		String expected = "Is this your account";

		int cellCount = sheet.getRow(i).getLastCellNum();

		XSSFCell cell = row.createCell(cellCount);
		if (actual.equals(expected))

		{

		System.out.println("Test case is passed");

		cell.setCellValue("Passed");

		} else

		{

		System.out.println("Test case is failed");

		cell.setCellValue("Failed");

		}

		}

		fs.close();

		FileOutputStream fout = new FileOutputStream(path);

		workbook.write(fout);

		fout.close();

		}

		}