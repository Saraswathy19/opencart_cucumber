package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver); //It is used to invoke parent class constructor
	}
	
	
	//Locators
	@FindBy(xpath="//span[text()='My Account']") WebElement lnkMyAccount;
	@FindBy(xpath="//a[text()='Register']") WebElement lnkRegister;
	@FindBy(xpath="//a[text()='Login']") WebElement lnkLogin;
	@FindBy(xpath="//input[@placeholder='Search']")WebElement txtSearchbox;  //For Search Product Test
	@FindBy(xpath="//div[@id='search']//button[@type='button']")WebElement btnSearch; //For Search Product Test
	
	
	//Action Methods
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}
	
	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}

}
