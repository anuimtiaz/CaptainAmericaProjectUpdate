package upskill.ebay.pageAction;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartDropDownLocators;
import upskill.utilities.ReadExcelData;
import upskill.utilities.SetupDrivers;

public class EbayCartDropDownActions {

	EbayCartDropDownLocators EbayCartDropDownLocatorsObj;
	

	public EbayCartDropDownActions() {
		EbayCartDropDownLocatorsObj = new EbayCartDropDownLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartDropDownLocatorsObj);
	}

	public void openNewWindow() {
		for (String control : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(control);
		}
	}

	public void selectSize() throws Exception {
	Select dropDownObj = new Select(EbayCartDropDownLocatorsObj.ddSizeType);
	dropDownObj.selectByVisibleText(ReadExcelData.getMapData("Size"));
	Thread.sleep(3000);
	
	Actions mouseObj = new Actions(SetupDrivers.driver);
	
	}

	public void selectMenSize() throws Exception {
	Select dropDownObj = new Select(EbayCartDropDownLocatorsObj.ddMenSize);
	dropDownObj.selectByIndex(6);
	Thread.sleep(3000);

	}

	public void selectShade() throws Exception {
	Select dropDownObj = new Select(EbayCartDropDownLocatorsObj.ddShade);
	dropDownObj.selectByIndex(2);
	Thread.sleep(3000);
	
	
	}

	public void selectQuantity() throws Exception {
		EbayCartDropDownLocatorsObj.txtbxQty.clear();
		EbayCartDropDownLocatorsObj.txtbxQty.sendKeys("2");
		Thread.sleep(3000);
	}

	public void shoppingCart() throws Exception {
		EbayCartDropDownLocatorsObj.btnAddCart.click();
		Thread.sleep(3000);
	}

}
