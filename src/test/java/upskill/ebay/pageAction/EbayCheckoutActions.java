package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCheckoutLocators;
import upskill.utilities.SetupDrivers;

public class EbayCheckoutActions {
	EbayCheckoutLocators EbayCheckoutLocatorsObj;

	public EbayCheckoutActions() {

		EbayCheckoutLocatorsObj = new EbayCheckoutLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCheckoutLocatorsObj);
	}
	public void openNewTab() throws Exception {
		for (String manage : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(manage);
			Thread.sleep(5000);
		}
	}
	public void selectColour() throws Exception {
		Select dropdwonObj = new Select(EbayCheckoutLocatorsObj.ddColour);
		dropdwonObj.selectByVisibleText("Black - Black");
		Thread.sleep(5000);
	}
	public void selectSize() throws Exception {
		Select dropdwonObj = new Select(EbayCheckoutLocatorsObj.ddSize);
		dropdwonObj.selectByIndex(8);
		Thread.sleep(5000);
	}
	public void selectAmount() throws Exception {
		EbayCheckoutLocatorsObj.txtBxQty.clear();
		Thread.sleep(5000);
		EbayCheckoutLocatorsObj.txtBxQty.sendKeys("2");
		Thread.sleep(5000);
	}
	public void buyItNow() throws Exception {
		EbayCheckoutLocatorsObj.clickBuyNow.click();
		Thread.sleep(5000);
	}
}
