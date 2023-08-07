package TestScript_OFOS;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.CheckOutPage;
import pom_scripts.DishesPage;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.MyOrderPage;

public class TC010_VerifyUserisAbletoIrderUsingPaypal extends Base_Test
{

	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");

		return data;
	}

	@Test(dataProvider = "logindata")
	public void VerifryUserisAbletoDispatchOrdered (String email,String pwd) throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		DishesPage dp=new DishesPage(driver);
		CheckOutPage cop=new CheckOutPage(driver);
		MyOrderPage mop=new MyOrderPage(driver);

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

		//Click on SixthDish on Home Page
		clickAction(hp.getSecondDish());
		test.log(LogStatus.PASS, "Click on OrderNow Button of dish Sucess");

		//click on AddtoCart button of first Dish
		clickAction(dp.getAddToCartButtonSecondDish());
		test.log(LogStatus.PASS, "Click on AddtoCart Button of dish Sucess");

		//click on checkout
		clickAction(dp.getCheckoutbutton());
		test.log(LogStatus.PASS, "Click on Checkout Button of dish Sucess");

		//click on Paypal radio Button
		boolean result = cop.getpaypalradioButton().isEnabled();
		System.out.println(result);
		Assert.assertEquals(result, true);
		
		clickAction(cop.getpaypalradioButton());



	}
}
