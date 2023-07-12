package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySigninLocators {

	@FindBy(xpath = "(//a[text()='Sign in'])[1]")
	public WebElement btnSignin;

	@FindBy(xpath = "//input[@id='userid']")
	public WebElement txtEmail;
	
	
	
	@FindBy(xpath = "//button[@id='signin-continue-btn']")
	public WebElement clickContinue;
	

	@FindBy(xpath = "(//input[@aria-label='Password for imtiaz.anu@gmail.com']")
	public WebElement txtPassword;

	@FindBy(xpath = "//button[@id='sgnBt']")
	public WebElement clickSignin;

	@FindBy(xpath = "//b[contains(text(),'Anu')]")
	public WebElement imtiazHomepage;

}
