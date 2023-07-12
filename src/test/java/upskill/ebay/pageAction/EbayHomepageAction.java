package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.ReadExcelData;
import upskill.utilities.SetupDrivers;

public class EbayHomepageAction {

	EbayHomepageLocators EbayHomepageLocatorsObj;

	public EbayHomepageAction() {
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
	}

//	public void searchShoes() {
//		EbayHomepageLocatorsObj.txtSearch.sendKeys("Shoes");
//		EbayHomepageLocatorsObj.btnSearch.click();
//
//	}
	
	public void searchShoes() throws Exception {
		EbayHomepageLocatorsObj.txtSearch.sendKeys(ReadExcelData.getMapData("Sakir"));
		EbayHomepageLocatorsObj.btnSearch.click();

	}

	public void searchItems(String items) throws Exception {
		EbayHomepageLocatorsObj.txtSearch.sendKeys(items);
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(4000);
	}

	public void bigTallTee() throws Exception {
		EbayHomepageLocatorsObj.txtSearch.sendKeys("big & tall cotton tee");
		Thread.sleep(2000);
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);

	}

	public void searchMensShoes() {
		EbayHomepageLocatorsObj.txtSearch.sendKeys("Mens Crocs Shoes");
		EbayHomepageLocatorsObj.btnSearch.click();
	}

	public void mousehoverMyEbay() throws Exception {

		Actions mouse = new Actions(SetupDrivers.driver);
		mouse.moveToElement(EbayHomepageLocatorsObj.mousehoverEbay);
		mouse.perform();
		Thread.sleep(3000);
	}

	public void clickOnSummary() {

		EbayHomepageLocatorsObj.clickSummary.isEnabled();
		EbayHomepageLocatorsObj.clickSummary.click();
	}

	public void handleAlert() {
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().getText();
		SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
	}

	public void synchronization() {
		/*
		 * Selenium Wait : 1. Implicit wait(Global), 2. Explicit wait(Conditional), 3.
		 * Fluent wait(intermittent)
		 */
		// Implicit Wait

		SetupDrivers.driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		// NoSuchElemete

		// Explicit Wait
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 90);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
		// ElementNotVisible

		// Fluent Wait
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);
		fluentWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
		fluentWait.withTimeout(60, TimeUnit.SECONDS);
		fluentWait.pollingEvery(10, TimeUnit.SECONDS);
		// 5 times
		// ElementNotVisible
	}

	public void keyboardKeys(){
		
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.COMMAND.CLEAR);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.NUMPAD1.NUMPAD0 .DELETE);
	}

}
