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
import pom_scripts.MyOrderPage;

public class TC005_RemoveLastOrderedDish_FromCart extends Base_Test
{

	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");

		return data;
	}

	@Test(dataProvider = "logindata")
	public void removeOrderedDish(String email,String pwd) throws InterruptedException 
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
		clickAction(hp.getLoginlink());
		test.log(LogStatus.PASS, "Clickon Login Button Sucess");
		System.out.println("Login Success");

		//Click on first Dish to orderNow Button
		clickAction(hp.getFourthDish());
		test.log(LogStatus.PASS, "Click on first Dish to orderNow Button Success");

		//Enter Quantity of dish
		enter_value(dp.getQuantityTextfield(), "10");
		test.log(LogStatus.PASS, "Enter Quantity of dish Success");

		//click on AddtoCart buuton of dish
		clickAction(dp.getAddToCartButtonSecondDish());
		test.log(LogStatus.PASS, "click on AddtoCart buuton of Stuffed_Jacket_Potatoesdish Success");

		//Click on checkout Button
		clickAction(dp.getCheckoutbutton());
		test.log(LogStatus.PASS, "Click on checkout Button Success");

		//Click on OrderNow Button
		clickAction(cop.getOrdernowButton());
		test.log(LogStatus.PASS, "Click on OrderNow Button Success");

		//Click on Remove icon of 
		clickAction(mop.getRecentdishRemoveicon());
		test.log(LogStatus.PASS, "Click on RecentdishRemoveicon Success");

	}
}
