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

public class TC007AddMultilpe_DishToCart extends Base_Test
{
	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");

		return data;
	}

	@Test(dataProvider = "logindata")
	public void AddMultilpeDishToCart(String email,String pwd) throws InterruptedException 
	{

		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		RestrauntPage rp=new RestrauntPage(driver);
		DishesPage dp=new DishesPage(driver);
		CheckOutPage cop=new CheckOutPage(driver);

		clickAction(hp.getLoginlink());
		test.log(LogStatus.PASS, "Clicking login link on Home Page Sucess");

		enter_value(lp.getEmailTF(), email);
		test.log(LogStatus.PASS, "Entering Username Sucess");

		enter_value(lp.getPwdTF(), pwd);
		test.log(LogStatus.PASS, "Entering Passwrord Sucess");

		clickAction(lp.getLoginButton());
		test.log(LogStatus.PASS, "Click on Login Button Sucess");
		//System.out.println("Login Success");

		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));

		clickAction(hp.getRestrauntlink());
		test.log(LogStatus.PASS, "Click on Restraunt link Sucess");

		clickAction(rp.getNorth_Street_Tavern_Restraunt());
		test.log(LogStatus.PASS, "Click on North_Street_Tavern Restraunt Sucess");


		clickAction(dp.getAddToCartButtonFirstDish());
		test.log(LogStatus.PASS, "Click on Stuffed_Jacket_Potatoes DishSucess");

		clickAction(dp.getAddToCartButtonSecondDish());
		test.log(LogStatus.PASS, "Click on Yorkshire_Lamb_Patties DishSucess");

		clickAction(dp.getAddToCartButtonThirdDish());
		test.log(LogStatus.PASS, "Click on Lobster_Thermidor DishSucess");


		//click on Checkout button on DishPage
		clickAction(dp.getCheckoutbutton());
		test.log(LogStatus.PASS, "Click on CheckOut Button Sucess");

		//Click on ordernow Button 
		clickAction(cop.getOrdernowButton());
		//driver.switchTo().alert().accept();

		try {
			
			driver.switchTo().alert().accept();
			test.log(LogStatus.PASS, "Alert is Handled");
			
		} catch (Exception e) {
		
		}

		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
	}

}
