package TestScript_OFOS;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import pom_scripts.CheckOutPage;
import pom_scripts.DishesPage;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.MyOrderPage;

public class TC011_ViewAll_FeaturedRestraunt extends Base_Test
{
	
	@Test()
	public void ViewAll_FeaturedRestraunt () throws Throwable 
	{
		String unm = getValueProperty("unm");
		String pwd = getValueProperty("pwd");
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		DishesPage dp=new DishesPage(driver);
		CheckOutPage cop=new CheckOutPage(driver);
		MyOrderPage mop=new MyOrderPage(driver);
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
		
		jsu.jsScrollIntoView(true, hp.getAmericanLink());
		//To Print all Restraunt Present
		for (WebElement element : hp.getallrestrauntname())
		{
			System.out.println(element.getText());
			
		}
	}
}
