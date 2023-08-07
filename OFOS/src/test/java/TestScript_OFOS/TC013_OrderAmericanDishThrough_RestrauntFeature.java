package TestScript_OFOS;

import java.io.IOException;

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

public class TC013_OrderAmericanDishThrough_RestrauntFeature extends Base_Test
{

	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");

		return data;
	}

	@Test(dataProvider = "logindata")
	public void OrderItalianDishThrough_RestrauntFeature  (String email,String pwd) throws InterruptedException 
	{
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
		enter_value(lp.getEmailTF(), email);
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
		jsu.jsClick(hp.getAmericanLink());
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Clickon  Italian Restraunt Link  Sucess");
		for (int i = 0; i < hp.getallrestrauntname().size(); i++)
		{
			System.out.println( hp.getallrestrauntname().size() );
			if(i==0)
			{
				jsu.jsClick( hp.getallrestrauntname().get(i));
				System.out.println( hp.getallrestrauntname().get(i).getText());
				break;
			}


		}


	}

}
