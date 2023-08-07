package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckOutPage extends BasePage
{
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (name="submit" )
	private WebElement OrdernowButton;
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalradiobutton;
	
	public WebElement getpaypalradioButton() {
		return  paypalradiobutton;
	}
	public WebElement getOrdernowButton() {
		return OrdernowButton;
	}
	public void setOrdernowButton(WebElement ordernowButton) {
		OrdernowButton = ordernowButton;
	}
	public void clickOrderNowButton() 
	{
		clickAction(OrdernowButton);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
	}

}
