package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbaySigninLocators;
import upskill.utilities.SetupDrivers;

public class EbaySigninActions {
	WebDriver driver;

	EbaySigninLocators EbaySigninLocatorsObj;

	public EbaySigninActions() {
		EbaySigninLocatorsObj = new EbaySigninLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySigninLocatorsObj);
	}

	public void clickSignin() {
	EbaySigninLocatorsObj.btnSignin.click();	
	}

	public void enterEmail() {
	EbaySigninLocatorsObj.txtEmail.sendKeys("imtiaz.anu@gmail.com");	
	}

	public void clickContinue() {
	EbaySigninLocatorsObj.clickContinue.click();		
	}

	public void enterPassword() {
	//System.out.println(input+"imtiaz.anu@gmail.com"+user);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("yourElementId")));
		element.click();
	EbaySigninLocatorsObj.txtPassword.sendKeys("TouroCumberlands_88");
	//SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Implicit wait
	}

	public void signIn() {
	EbaySigninLocatorsObj.clickSignin.click();
	}

	public void verifySigninPage() {
	EbaySigninLocatorsObj.imtiazHomepage.isDisplayed();	
	}
}
