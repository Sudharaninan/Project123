package GenericMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseP2.BaseC2;

public class Genericmethods {

	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)BaseC2.driver;
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
		
		
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
		
	String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
	}	
	
public static void ScrollView(WebElement Element)
{
	JavascriptExecutor js = (JavascriptExecutor) BaseC2.driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);", Element);
}

public static void Javascriptexecutor_click(WebElement Element)
{
	JavascriptExecutor js = (JavascriptExecutor)BaseC2.driver;
	js.executeScript("arguments[0].click();", Element);
}


public static void Javascriptexecutor_Sendkeys(WebElement Element,String Value)
{
	JavascriptExecutor js = (JavascriptExecutor) BaseC2.driver;
	js.executeScript("arguments[0].value='"+ Value +"';", Element);
}

public static void SelectBy_index(int index,WebElement Element )
{
Select dropdownindex= new Select(Element);
dropdownindex.selectByIndex(index);

}

public static void SelectBy_Value(String Value,WebElement Element)
{
	Select dropdownindex= new Select(Element);
	dropdownindex.selectByValue(Value);
}

public static void SelectBy_visibleText(String Value,WebElement Element)
{
	Select dropdownindex= new Select(Element);
	dropdownindex.selectByVisibleText(Value);
}


}
