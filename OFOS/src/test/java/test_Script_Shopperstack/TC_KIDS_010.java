package test_Script_Shopperstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.BasePage;


public class TC_KIDS_010 extends Base_Test
{
	@Test
	public void tc_kids_010() throws InterruptedException 
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
		Thread.sleep(3000);
		//Click on Kids Section
		//bp.clickAction(driver.findElement(By.id("kids")));
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Kids']"))).click().perform();
		System.out.println("user clicked Kids Seccesion");
		test.log(LogStatus.PASS, "user clicked Kids Seccesion");
		
		
		//click on T-shirt Section
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"))).click().perform();
		System.out.println("user clicked T-shirt in Kids-Boys Seccesion");
		test.log(LogStatus.PASS, "user clicked T-shirt in Kids-Boys Seccesion");
		
		//Get the Rating of the product and print it
		WebElement rating_ele = driver.findElement(By.xpath("(//span)[1]"));
		System.out.println("Rating: "+rating_ele.getText());
		
		System.out.println("TC_KIDS_010 Sucessful");
	}
}
