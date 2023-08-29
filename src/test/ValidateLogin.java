package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pom.HomePage;
import pom.LoginPage;
import utility.Utility;

public class ValidateLogin extends Base {
    HomePage hm ;
	LoginPage login;
   @BeforeClass
   public void openBuildaBear() throws InterruptedException
   {  
	   launchBuildAbear();
	   hm = new HomePage(driver);
	   login = new LoginPage(driver);
	   Thread.sleep(2000);
   }
  @Test(priority = 0)
  public void validateSignUpLoginButton() {
	  hm.clickOnDoNotSellorShareMyPIButton();
	  hm.clickOnLogInORSignUpButton();
  }
  @Test(priority =-2)
  public void validateBuild_A_BearURL()
  {
	  String expectedURL="https://www.buildabear.com/";
	  String actualURL = driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, expectedURL,"Actual and expected Build-A-Bear application URL does not matching");
	  Reporter.log("URL is matching", true);
  }
  @Test(priority = -1)
  public void validateSignUpButtonIsDisplayed()
  { 
	  Assert.assertTrue(hm.signUpButtonDisplayed(),"SignUp button is not displayed");
	  Reporter.log("Log In/Sign Up button is displayed", true);
  }
  @Test
  public void validatingloginPageURL()
  {   String expectedLoginPageURL = "https://www.buildabear.com/login";
 	  String actualUrl = driver.getCurrentUrl();
 	  Assert.assertEquals(expectedLoginPageURL, actualUrl);
	    Reporter.log("Loginn page URL is matching", true);	  
  }
  @Test(priority = 1)
  public void validateLogin() throws InterruptedException {
	 
	   Thread.sleep(5000);
   
	  Assert.assertTrue(login.emailIdDisplayed(),"Email id field is not displayed");
	  
	   Thread.sleep(2000);
	   login.clickOnemaild();
	   login.clickOnBirthMonthList();
	   login.clickOnBirthYearList();
	   login.clickOnContinue();
	   Thread.sleep(1000);
	  login.enterEmailId("pallavipustake94@gmail.com");
	  Thread.sleep(2000);
	  login.enterPassword("Pallavi@10");
	  Thread.sleep(1000);
	  Utility.scrollBy();
	  login.clickOnLogin();	  
  }
}
