package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(name   ="username")
	private WebElement emailTF;
	
	@FindBy(name = "password")
	private WebElement pwdTF;
	
	@FindBy(id= "buttn")
	private WebElement LoginButton;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPwdTF() {
		return pwdTF;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	
}
