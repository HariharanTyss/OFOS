package test_Script_Shopperstack;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import generic.Base_Test;

public class TC_KIDS_003 extends Base_Test{

	@Test
	public void TC_KIDS_003() 
	{
		driver.navigate().to("https://demo.actitime.com/login.do");
		System.out.println("TC_KIDS_003 Sucessful");
	}
}
