package test_Script_Shopperstack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.BasePage;

public class TC_KIDS_002 extends Base_Test
{

	@Test
	public void TC_KIDS_002() throws InterruptedException 
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
		test.log(LogStatus.PASS, "Confirming the rightpage is clicked or not ");

		Assert.assertEquals(driver.getTitle(), title,"Verifying page using title");
		System.out.println("User is now  in welcomePage with valid login credentials And Pass ");

		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("kids")));
		//Click on Kids Section
		//bp.clickAction(driver.findElement(By.id("kids")));
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Kids']"))).click().perform();
		
		System.out.println("user clicked Kids Seccesion");
		test.log(LogStatus.PASS, "user clicked Kids Seccesion");

		
		//Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Validate User is kids page or not
		String title1 = "ShoppersStack | Kids";
		test.log(LogStatus.PASS, "verifying the user in kidspage or not ");

		Assert.assertEquals(driver.getTitle(), title1,"Verifying page using Title");
		System.out.println("User is now  in KidsPage with valid login credentials And Pass ");

		test.log(LogStatus.PASS, "TEST PASS");
		driver.quit();
		System.out.println("TC_KIDS_002 Sucessful");
	}
}
