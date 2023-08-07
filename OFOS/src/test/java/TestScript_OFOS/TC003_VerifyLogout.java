package TestScript_OFOS;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;

public class TC003_VerifyLogout extends Base_Test
{
	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");
		
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void verifyLogin(String email,String pwd) throws InterruptedException 
	{
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		test.log(LogStatus.PASS, " Home Page is Displayed  ");
		
		clickAction(hp.getLoginlink());
		test.log(LogStatus.PASS, "Clicking login link on Home Page Sucess");
	
		test.log(LogStatus.PASS, "Login  Page is Displayed");
		
		enter_value(lp.getEmailTF(), email);
		test.log(LogStatus.PASS, "Entering Username Sucess");
		
		enter_value(lp.getPwdTF(), pwd);
		test.log(LogStatus.PASS, "Entering Passwrord Sucess");

		clickAction(lp.getLoginButton());
		test.log(LogStatus.PASS, "Clickon Login Button Sucess");
		
		System.out.println("Login Success");
		
		clickAction(hp.getlogo());
		
		
		clickAction(hp.getLogoutlink());
		test.log(LogStatus.PASS, "Clickon Log Out Button Sucessful");
		

		
	}



}
