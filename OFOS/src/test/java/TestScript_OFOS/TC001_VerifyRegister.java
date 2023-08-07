package TestScript_OFOS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.BasePage;
import pom_scripts.HomePage;
import pom_scripts.RegisterPage;

public class TC001_VerifyRegister extends Base_Test
{
	@DataProvider(name="Registerdata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Register");

		return data;
	}

	@Test(dataProvider = "Registerdata")
	public void verifyRegister(String unm,String fnm, String lnm,String email,String pwd,String cpwd,String phoneno,String adrs) throws InterruptedException 
	{

		HomePage hp=new HomePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		
		test.log(LogStatus.INFO, "Clicking Register link on Home Page Sucess");
		Assert.assertEquals(driver.getTitle(), "Home");
		
		clickAction(hp.getRegisterLink());
		test.log(LogStatus.PASS, "Entered into Registerd Page Sucess");
		
		enter_value(rp.getUsrnm_txtfld(), unm);
		test.log(LogStatus.PASS, "Entering UserName Sucess");

		enter_value(rp.getFrstnm_txtfld(), fnm);
		test.log(LogStatus.PASS, "Entering FirstName Sucess");

		enter_value(rp.getLstnm_txtfld(), lnm);
		test.log(LogStatus.PASS, "Entering LastName Sucess");

		enter_value(rp.getEmail_txtfld(), email);
		test.log(LogStatus.PASS, "Entering EmailName Sucess");

		enter_value(rp.getPhone_txtfld(), phoneno);
		test.log(LogStatus.PASS, "Entering PhoneNumber Sucess");
		
		enter_value(rp.getPaswrd_txtfld(), pwd);
		test.log(LogStatus.PASS, "Entering Password Sucess");
		
		enter_value(rp.getCnfrmpaswrd_txtfld(), cpwd);
		test.log(LogStatus.PASS, "Entering ConfirmPassword Sucess");

		enter_value(rp.getDlvry_adrs_txtfld(), adrs);
		test.log(LogStatus.PASS, "Entering Deliver Address Sucess");

		clickAction(rp.getRegisterbutton());
		test.log(LogStatus.PASS, "Click on Register Button Sucess");


		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS, "Register Sucesfully Completed");
		
		Reporter.log("Register Sucess Completed",true);
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
	}

}
