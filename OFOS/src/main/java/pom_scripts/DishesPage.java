package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DishesPage extends BasePage
{
	public DishesPage(WebDriver driver) 
	{
		super(driver);
	}
	


	public WebElement getAddToCartButtonFirstDish() {
		return AddToCartButtonFirstDish;
	}

	public WebElement getAddToCartButtonSecondDish() {
		return AddToCartButtonSecondDish;
	}

	public WebElement getAddToCartButtonThirdDish() {
		return AddToCartButtonThirdDish;
	}



	@FindBy(xpath = "(//input[@value='Add To Cart'])[1]")
	private WebElement AddToCartButtonFirstDish;
	
	@FindBy(xpath = "(//input[@value='Add To Cart'])[2]")
	private WebElement AddToCartButtonSecondDish;
	
	public @FindBy(xpath = "(//input[@value='Add To Cart'])[3]")
	WebElement AddToCartButtonThirdDish;
	

	@FindBy(xpath = "//a[contains(text(),'Yorkshire Lamb Patties')]/../../../../../div[2]/span")
	private WebElement priceOfFirstDish;
	
	public String getpriceOfFirstDish() {
		return priceOfFirstDish.getText();
	}
	
	@FindBy(name="quantity")
	private WebElement quantityTextfield;
	
	public void enterquantity(String string) 
	{
		quantityTextfield.clear();
		enter_value(quantityTextfield, string);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	private WebElement checkoutbutton;
	
	
	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	public void setCheckoutbutton(WebElement checkoutbutton) {
		this.checkoutbutton = checkoutbutton;
	}



	public WebElement getQuantityTextfield() {
		// TODO Auto-generated method stub
		return quantityTextfield;
	}




	
	
	

}
