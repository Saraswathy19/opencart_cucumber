package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Locators
	@FindBy(id="input-firstname") WebElement txtFirstname;
	@FindBy(id="input-lastname") WebElement txtLastname;
	@FindBy(id="input-email") WebElement txtEmail;
	@FindBy(id="input-telephone") WebElement txtTelephone;
	@FindBy(id="input-password") WebElement txtPassword;
	@FindBy(id="input-confirm") WebElement txtConfirmPassword;
	@FindBy(name="agree") WebElement chkdterms;
	@FindBy(xpath="//input[@type='submit']") WebElement btnSub;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	
	//Action Methods
	public void setFirstName(String firstname)
	{
		txtFirstname.sendKeys(firstname);
	}
	
	public void setLastName(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPhoneNo(String phonenum)
	{
		txtTelephone.sendKeys(phonenum);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String conpassword)
	{
		txtConfirmPassword.sendKeys(conpassword);
	}


	public void checkTerms() {
		chkdterms.click();
	}
	
	public void clickSub() {
		//sol1
		btnSub.click();
		
		//sol2 
		//btnSub.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnSub).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnSub);
		
		//Sol 5
		//btnSub.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnSub)).click();
	}
	
	/*public boolean msgDisplay() {
		boolean msg_status=msgConfirmation.isDisplayed();
		return msg_status;
	} */
	
	public String msgDisplay() {
		try {
		 return msgConfirmation.getText();
		}
		catch(Exception e){
			return e.getMessage();
		}
	}
}
