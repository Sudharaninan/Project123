package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseP2.BaseC2;
import GenericMethods.Genericmethods;

public class loginpage extends BaseC2
{

	
public static By Emailid= By.id("email");
public static By passwordid=By.xpath("//input[@name='pass']");
public static By login=By.xpath("//button[@name='login']");
public static By Pageheader=By.xpath("//h2");



public static void InputEMail(String inputemaildata)
{
	driver.findElement(Emailid).sendKeys(inputemaildata);
}


public static void Inputpassword(String inputpassworddata)
{
	driver.findElement(passwordid).sendKeys(inputpassworddata);
}

public static  void Button_login()
{
	Genericmethods GM= new Genericmethods();
	WebElement buttonlogin=driver.findElement(login);
	GM.Javascriptexecutor_click(buttonlogin);
	
	
}

}







