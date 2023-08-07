package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement getRegisterbutton() {
		return registerbutton;
	}


	public WebElement getUsrnm_txtfld() {
		return usrnm_txtfld;
	}


	public WebElement getFrstnm_txtfld() {
		return frstnm_txtfld;
	}


	public WebElement getLstnm_txtfld() {
		return lstnm_txtfld;
	}


	public WebElement getEmail_txtfld() {
		return email_txtfld;
	}


	public WebElement getPhone_txtfld() {
		return phone_txtfld;
	}


	public WebElement getPaswrd_txtfld() {
		return paswrd_txtfld;
	}


	public WebElement getCnfrmpaswrd_txtfld() {
		return cnfrmpaswrd_txtfld;
	}


	public WebElement getDlvry_adrs_txtfld() {
		return dlvry_adrs_txtfld;
	}

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerbutton;
	
	
	@FindBy(id = "example-text-input")
	private WebElement usrnm_txtfld;
	
	
	@FindBy(name = "firstname")
	private WebElement frstnm_txtfld;
	
	
	@FindBy(name = "lastname")
	private WebElement lstnm_txtfld;
	
	
	@FindBy(name = "email")
	private WebElement email_txtfld;
	
	
	@FindBy(name = "phone")
	private WebElement phone_txtfld;
	
	
	@FindBy(name = "password")
	private WebElement paswrd_txtfld;

	@FindBy(name = "cpassword")
	private WebElement cnfrmpaswrd_txtfld;
	

	@FindBy(name = "address")
	private WebElement dlvry_adrs_txtfld;
	
	
	
	

}
