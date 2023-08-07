package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestrauntPage extends BasePage
{
	public RestrauntPage(WebDriver driver) 

	{
		super(driver);
	}

	@FindBy (xpath = "(//div[@class='bg-gray restaurant-entry']//h5)[1]")
	private WebElement first_Restrauntname;
	
	@FindBy (xpath = "(//div[@class='bg-gray restaurant-entry']//h5)[2]")
	private WebElement second_Restrauntname;
	
	@FindBy (xpath = "(//div[@class='bg-gray restaurant-entry']//h5)[3]")
	private WebElement third_Restrauntname;
	
	@FindBy(xpath = "//div[@class='bg-gray restaurant-entry']//h5")
	private List<WebElement> All_Restraunt_name;
	
	@FindBy(xpath = "//a[contains(text(),'North Street Tavern')]")
	private WebElement North_Street_Tavern_Restraunt;

	@FindBy(xpath = "//a[contains(text(),'Eataly')]")
	private WebElement Eataly_Restraunt;

	@FindBy(xpath = "//a[contains(text(),'Nan Xiang Xiao Long Bao')]")
	private WebElement Nan_Xiang_Xiao_Long_Bao_Restraunt;

	@FindBy(xpath = "//a[contains(text(),'Highlands Bar & Grill')]")
	private WebElement Highlands_Bar_Grill_Restraunt;

	

	public List<WebElement> getAll_Restraunt_name() {
		return All_Restraunt_name;
	}

	public WebElement getNorth_Street_Tavern_Restraunt() {
		return second_Restrauntname;
	}

	public WebElement getEataly_Restraunt() {
		return Eataly_Restraunt;
	}

	public WebElement getNan_Xiang_Xiao_Long_Bao_Restraunt() {
		return Nan_Xiang_Xiao_Long_Bao_Restraunt;
	}

	public WebElement getHighlands_Bar_Grill_Restraunt() {
		return Highlands_Bar_Grill_Restraunt;
	}

	public WebElement getfirst_Restrauntname() {
		return first_Restrauntname;
	}

	public WebElement getsecond_Restrauntname() {
		return North_Street_Tavern_Restraunt;
	}

	public WebElement getthird_Restrauntname() {
		return third_Restrauntname;
	}


}
