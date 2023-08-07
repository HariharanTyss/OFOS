package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrderPage extends BasePage
{
	public MyOrderPage(WebDriver driver) {

		super(driver);
	}

	@FindBy (xpath = "//tbody/tr[1]/td[1]")
	private WebElement Recentdishname;

	@FindBy (xpath = "//tbody/tr[1]/td[2]")
	private  WebElement Recentdishquantity;

	@FindBy (xpath = "//tbody/tr[1]/td[3]")
	private  WebElement Recentdishprice;
	
	@FindBy (xpath = "//tbody/tr[1]/td[4]/button")
	private  WebElement RecentdishDispatch;

	@FindBy (xpath = "//tbody/tr[1]/td[6]/a/i")
	private WebElement RecentdishRemoveicon;
	
	public WebElement getRecentdishname() {
		return Recentdishname;
	}

	public WebElement getRecentdishquantity() {
		return Recentdishquantity;
	}

	public WebElement getRecentdishDispatch() {
		return RecentdishDispatch;
	}
	public WebElement getRecentdishprice() {
		return Recentdishprice;
	}

	public WebElement getRecentdishRemoveicon() {
		return RecentdishRemoveicon;
	}
	
	


	
}
