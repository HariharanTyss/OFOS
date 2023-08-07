package TestScript_OFOS;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.JavaScriptUtil;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.RestrauntPage;

public class TC017_VerifyOrderNorthindianDish extends Base_Test
{
	

	@Test
	public void VerifyOrderNorthindianDish() throws Throwable 
	{
		String unm = getValueProperty("unm");
		String pwd = getValueProperty("pwd");

		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		RestrauntPage rp=new RestrauntPage(driver);
		JavaScriptUtil jsu=new JavaScriptUtil();

		//Clicking login link on Home Page  
		clickAction(hp.getLoginlink());
		test.log(LogStatus.PASS, "Clicking login link on Home Page Sucess");

		//Entering Username 
		enter_value(lp.getEmailTF(), unm);
		test.log(LogStatus.PASS, "Entering Username Sucess");

		//Entering Passwrord 
		enter_value(lp.getPwdTF(), pwd);
		test.log(LogStatus.PASS, "Entering Passwrord Sucess");

		//Clickon Login Button 
		clickAction(lp.getLoginButton());
		test.log(LogStatus.PASS, "Clickon Login Button Sucess");

		//Clickon NorthIndian Restraunt link 
		clickAction(hp.getNorthIndianLink());
		test.log(LogStatus.PASS, "Click on Restrauntlink Sucess");
		
		System.out.println("Click on NorthIndian Restrauntlink Sucess");

		//Scroll down to the NorthIndianLink
		jsu.jsScrollIntoView(true, hp.getNorthIndianLink());
		
		//To Print all Restraunt Present
		for (WebElement element : hp.getallrestrauntname())
		{
			System.out.println(element.getText());
			
		}
	}

}
