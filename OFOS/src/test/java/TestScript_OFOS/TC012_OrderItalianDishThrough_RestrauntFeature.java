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

public class TC012_OrderItalianDishThrough_RestrauntFeature extends Base_Test
{




	@Test()
	public void OrderItalianDishThrough_RestrauntFeature  () throws Throwable 
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


		Thread.sleep(6000);
		jsu.jsScrollToBottomOfThePage();

		//Click on Italian Restraunt Link from Restraunt Feature 
		jsu.jsClick(hp.getItalianLink());
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clickon  Italian Restraunt Link  Sucess");

		for (int i = 0; i < hp.getallrestrauntname().size(); i++)
		{
			if(i==0) {

				jsu.jsClick( hp.getallrestrauntname().get(i));
				System.out.println( hp.getallrestrauntname().get(i).getText());
				break;
			}


		}


	}
}
