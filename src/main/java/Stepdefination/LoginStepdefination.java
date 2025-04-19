package Stepdefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginpage;
import GenericMethods.Genericmethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepdefination extends loginpage
{

	@Given("user is on login page")
	public static void user_is_on_login_page() throws IOException
	{
		application_lanuch(brower,url);
		ExtentCucumberAdapter.addTestStepLog("application is lanuched succesfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.captureScreenShot());
		
	}
	
	
	
	@When("^user enters valid Pusername\"([^\"]*)\"$")
	public static void user_enters_valid_username(String username) throws IOException
	{
		InputEMail(username);
		ExtentCucumberAdapter.addTestStepLog("user enters the emailid"+username+  "successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.captureScreenShot());
	}
	
	@And("^user enters valid Ppassword\"([^\"]*)\"$")
	public static void user_enters_valid_password(String password) throws IOException
	{
		Inputpassword(password);
		ExtentCucumberAdapter.addTestStepLog("user enters the password"+password+  "successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.captureScreenShot());
	}
	
	
	
	@When("user enters valid username{string}")
	public static void user_enters_validusername(String username)
	{
		InputEMail(username);
	}
	
	@And("user enters valid password{string}")
	public static void user_enters_validpassword(String password)
	{
		Inputpassword(password);
	}
	
	@And("clicks on submit button")
	public static void clicks_submit_button() throws IOException
	{
		Button_login();
		ExtentCucumberAdapter.addTestStepLog("login is done successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Genericmethods.captureScreenShot());
	}
	
}
