package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class LoginPage {

	@FindBy(xpath = "(//input[@name='dwfrm_login_username'])[1]") private WebElement emailIdField;
	@FindBy(xpath = "(//input[@type='password'])[1]") private WebElement passwordField;
	@FindBy(xpath = "(//button[@name='dwfrm_login_login'])[1]") private WebElement loginButton;
    @FindBy(xpath = "(//select[@name='agegate_month'])[2]") private WebElement birthMonthListBox;
    @FindBy(xpath = "(//select[@name='agegate_year'])[2]") private WebElement birthYearListBox;
   @FindBy(xpath = "//button[text()='Continue']") private WebElement continueButton;
	//initializing
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilizing
	public boolean emailIdDisplayed() {
		 boolean status = emailIdField.isDisplayed();
		 return status;
		
	}
	public void clickOnemaild() {
		 emailIdField.click();
		
	}
	public void enterEmailId(String emailId) {
		emailIdField.sendKeys(emailId);
		Reporter.log("Entering email id", true);
	}
	public void enterPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
		Reporter.log("Entering password", true);
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
		Reporter.log("Clicking on Log In", true);
	}
	Select sc;
	public void clickOnBirthMonthList()
	{   sc= new Select(birthMonthListBox);
		sc.selectByVisibleText("March");
	}
	public void clickOnBirthYearList()
	{
		sc = new Select(birthYearListBox);
		sc.selectByVisibleText("2000");
	}
	public void clickOnContinue() {
		continueButton.click();
	}
}
