package TestScript_OFOS;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.RegisterPage;

public class TC002_Verifylogin extends Base_Test
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
		
		clickAction(hp.getLoginlink());
		test.log(LogStatus.PASS, "Clicking login link on Home Page Sucess");
		
		enter_value(lp.getEmailTF(), email);
		test.log(LogStatus.PASS, "Entering Username Sucess");
		
		enter_value(lp.getPwdTF(), pwd);
		test.log(LogStatus.PASS, "Entering Passwrord Sucess");
		
		clickAction(lp.getLoginButton());
		test.log(LogStatus.PASS, "Clickon Login Button Sucess");
		
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		System.out.println("Login Success");
	}



}
