package TestScript_OFOS;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class TC008_RemoveAll_Dishes_inCart extends Base_Test
{

	@DataProvider(name="logindata")
	public  Object[][] dataprovider() throws IOException
	{
		Object[][] data = ReadExcel.getMultipleData("Login");

		return data;
	}

	@Test(dataProvider = "logindata")
	public void RemoveAllOrderedDish(String email,String pwd) throws InterruptedException 
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
		System.out.println("Login Success");

		//Click on My Order Link
		clickAction(hp.getMyOrderlink());
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));


		try {
			Assert.assertEquals(mop.getRecentdishRemoveicon().isDisplayed(), true);
			test.log(LogStatus.PASS, "Remove icon present");
		}catch (NoSuchElementException e) {
			test.log(LogStatus.FAIL, "Remove icon present");
		}
		
		//Remove All Recently added Dish
		while(mop.getRecentdishRemoveicon().isDisplayed()) {
			clickAction(mop.getRecentdishRemoveicon());
			driver.switchTo().alert().accept();
		}


		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.PASS, " Removed All Dishess Succesfully");

	}
}
