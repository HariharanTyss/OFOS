package test_Script_Shopperstack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.BasePage;

public class TC_KIDS_001 extends Base_Test
{

	@Test
	public void tc_kids_001() throws InterruptedException 
	{
		
		//report.startTest(TEST_NAME);
		test.log(LogStatus.PASS, "CHROME Browser opened Sucessfully");
		BasePage bp=new BasePage(driver);
		
	
		
		//Click on Login Button in HomePage
		bp.clickAction(driver.findElement(By.id("loginBtn")));
		test.log(LogStatus.PASS, "Login Clicked Sucessfully");
		
		//Enter the valid Login Credential and login
		try {
			bp.enter_value(driver.findElement(By.id("Email")), getValueProperty("email"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			bp.enter_value(driver.findElement(By.id("Password")), getValueProperty("pwd"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		bp.clickAction(driver.findElement(By.id("Login")));
		System.out.println("Login Sucessful");
		test.log(LogStatus.PASS, "Login Sucessfully");

		WebDriverWait wait=new WebDriverWait(driver, TIMEOUTS_WAIT);
        wait.until(ExpectedConditions.titleContains("ShoppersStack | Home"));
		
		//Validate User is Able to Login
		String title = "ShoppersStack | Home";
		test.log(LogStatus.PASS, "validating ");
		
		Assert.assertEquals(driver.getTitle(), title,"Verifying page using title");
		System.out.println("User is able to login And Pass ");
		System.out.println("tc_kids_001 Pass");
		test.log(LogStatus.PASS, "TEST PASS");
		
	}
	
}
