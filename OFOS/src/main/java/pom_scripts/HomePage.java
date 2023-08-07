package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{



	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "img-rounded")
	private WebElement logo;

	@FindBy(xpath = "//a[contains(text(),'Home ')]")
	private WebElement Homelink;

	@FindBy(xpath = "//a[contains(text(),'Restaurants ')]")
	private WebElement Restrauntlink;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement Loginlink;

	@FindBy(xpath = "//a[contains(text(),'My Orders')]")
	private WebElement MyOrderlink;

	@FindBy (xpath = "//a[contains(text(),'Logout')]")
	private WebElement Logoutlink;

	@FindBy(xpath  = "//a[contains(text(),'Register')]")
	private WebElement RegisterLink;

	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[1]")
	private WebElement firstDish;


	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[2]")
	private WebElement secondDish;

	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[3]")
	private WebElement thirdDish;

	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[4]")
	private WebElement fourthDish;

	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[5]")
	private WebElement fifthDish;

	@FindBy (xpath = "(//a[contains(text(),'Order Now')])[6]")
	private WebElement sixthDish;

	@FindBy (xpath = "//a[contains(text(),'all')]")
	private WebElement AllLink;

	@FindBy (xpath = "//a[contains(text(),'Continental')]")
	private WebElement ContinentalLink;

	@FindBy (xpath = "//a[contains(text(),'Italian')]")
	private WebElement ItalianLink;

	@FindBy (xpath = "//a[contains(text(),'Chinese')]")
	private WebElement ChineseLink;

	@FindBy (xpath = "//a[contains(text(),' American')]")
	private WebElement AmericanLink;

	@FindBy (xpath = "//a[contains(text(),'North Indian')]")
	private WebElement  NorthIndianLink;

	@FindBy (xpath = "//a[contains(text(),' hell')]")
	private WebElement  hellRestaruntLink;
	
	@FindBy(xpath = "//div[@class='restaurant-wrap']//h5")
	private List<WebElement> allrestrauntname;

	public List<WebElement>  getallrestrauntname() {
		return allrestrauntname;
	}
	public WebElement getHomelink() {
		return Homelink;
	}
	public WebElement getRestrauntlink() {
		return Restrauntlink;
	}
	public WebElement getLoginlink() {
		return Loginlink;
	}
	public WebElement getMyOrderlink() {
		return MyOrderlink;
	}
	public WebElement getLogoutlink() {
		return Logoutlink;
	}
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	public WebElement getFirstDish() {
		return firstDish;
	}
	public WebElement getSecondDish() {
		return secondDish;
	}
	public WebElement getThirdDish() {
		return thirdDish;
	}
	public WebElement getFourthDish() {
		return fourthDish;
	}
	public WebElement getFifthDish() {
		return fifthDish;
	}
	public WebElement getSixthDish() {
		return sixthDish;
	}
	public WebElement getlogo() {
		return logo;
	}
	public WebElement getAllLink() {
		return AllLink;
	}
	public WebElement getContinentalLink() {
		return ContinentalLink;
	}
	public WebElement getItalianLink() {
		return ItalianLink;
	}
	public WebElement getChineseLink() {
		return ChineseLink;
	}
	public WebElement getAmericanLink() {
		return AmericanLink;
	}
	public WebElement getNorthIndianLink() {
		return NorthIndianLink;
	}
	public WebElement gethellRestaruntLink() {
		return hellRestaruntLink;
	}

}
