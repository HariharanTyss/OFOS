package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.RegisterPage;

public class RegisterTest extends Base_Test {

	@Test(dataProvider = "register")
	public void registerTest(String FirstName, String LastName,String email, String Password, String confirmPassword) {
		
		HomePage welcomePage = new HomePage(driver);
		//welcomePage.clickRegister();
		test.log(LogStatus.FAIL, "step failed");
		RegisterPage registerPage = new RegisterPage(driver);

		
	}


	@DataProvider(name = "register") 
	public Object[][] registerData() throws
	IOException { 

		return ReadExcel.getMultipleData("register"); 
	}



}
