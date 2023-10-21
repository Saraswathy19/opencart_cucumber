package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(id="input-email") WebElement txtEmail;
	@FindBy(id="input-password") WebElement txtPswd;
	@FindBy(xpath="//input[@type='submit']") WebElement btnLogin;
	
	
	//Action Methods
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPswd(String Password) {
		txtPswd.sendKeys(Password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	

}
