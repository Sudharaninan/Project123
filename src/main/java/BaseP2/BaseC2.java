package BaseP2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC2 {

public static String brower="Chrome";
	
	public static String url="https://www.FB.com";
	
	public static WebDriver driver;
	
	public static void application_lanuch(String browser,String url)
	{
		
		switch(browser)
		{
		case "Chrome":
		{
			WebDriverManager.chromedriver().setup();
			
			 driver= new ChromeDriver();
			driver.get(url);
			break;
		}
		
		case "IE":
		{
			WebDriverManager.iedriver().setup();
			
			 driver= new InternetExplorerDriver();
			driver.get(url);
			break;
		}
		
		case "firefox":
		{
			WebDriverManager.edgedriver().setup();
			
			// driver= new EdgeDriver();
			driver.get(url);
			break;
		}
		}
		
	}
	
public static void application_close()
{
	driver.close();
}
	
}
