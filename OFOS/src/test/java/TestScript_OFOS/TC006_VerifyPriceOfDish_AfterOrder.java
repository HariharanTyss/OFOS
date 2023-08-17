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
import pom_scripts.RestrauntPage;

public class TC006_VerifyPriceOfDish_AfterOrder extends Base_Test
{
	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");
		
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void VerifyPrice  (String email,String pwd) 
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
		
		clickAction(hp.getRestrauntlink());
		test.log(LogStatus.PASS, "Click on Restraunt link  Sucess");
		
		clickAction(rp.getHighlands_Bar_Grill_Restraunt());
		test.log(LogStatus.PASS, "click on Highlands_Bar_Grill_Restraunt Sucess");
		
		clickAction(dp.getAddToCartButtonThirdDish());
		test.log(LogStatus.PASS, "click on ClickOrder third dish Sucess");
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		
		System.out.println(dp.getAddToCartButtonSecondDish());
		
		Assert.assertEquals(dp.getpriceOfFirstDish(), "$14.00","Verifying price");
		
		clickAction(dp.getCheckoutbutton());
		test.log(LogStatus.PASS, "Clicking CheckoutButton is  Sucess");
		
		clickAction(cop.getOrdernowButton());
		test.log(LogStatus.PASS, "click on OrderNow Button Sucess");
		
		test.log(LogStatus.PASS, "Verifying Price Sucessful");
		
	}
}
