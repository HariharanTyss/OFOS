package TestScript_OFOS;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.CheckOutPage;
import pom_scripts.DishesPage;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.RestrauntPage;

public class TC004_OrderDishToCartFromHome extends Base_Test
{

	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");
		
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void orderfood(String email,String pwd) 
	{
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		DishesPage dp=new DishesPage(driver);
		CheckOutPage cop=new CheckOutPage(driver);
		
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
		
		System.out.println("Login Success");

		//Click on first Dish to orderNow Button
		clickAction(hp.getFirstDish());
		test.log(LogStatus.PASS, "Click on first Dish to orderNow Button Success");

		//click on AddtoCart buuton of dish

		clickAction(dp.getAddToCartButtonFirstDish());
		test.log(LogStatus.PASS, "click on AddtoCart buuton of dish Success");

		//Click on checkout Button
		clickAction(dp.getCheckoutbutton());
		test.log(LogStatus.PASS, "Click on checkout Button Success");
		
		//Click on OrderNow Button
		clickAction(cop.getOrdernowButton());
		test.log(LogStatus.PASS, "Click on OrderNow Button Success");
		
		//Taking Screenshot 
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
	}

}
