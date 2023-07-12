package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySearchresultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchresultAction {

	EbaySearchresultLocators EbaySearchresultLocatorsObj;
	
	public EbaySearchresultAction() {
	EbaySearchresultLocatorsObj = new EbaySearchresultLocators();	
	PageFactory.initElements(SetupDrivers.driver, EbaySearchresultLocatorsObj);	
	}
	
	public void verifyShoes() {
	EbaySearchresultLocatorsObj.txtShoes.isDisplayed();
	}
	
	public void filterBrand(String brand) throws Exception{
		if(brand.equals("Gucci")) {
			EbaySearchresultLocatorsObj.clickGucci.click();
		} else if(brand.equals("Rolex")) {
			EbaySearchresultLocatorsObj.clickRolex.click();
		} else if(brand.equals("Chanel")) {
			EbaySearchresultLocatorsObj.clickChanel.click();
		} else {
			System.out.println("Brand not found");
		}
		Thread.sleep(4000); 
	}
	
	public void verifyBrandItems(String brand) throws Exception{
		if(brand.equals("Gucci")) {
			EbaySearchresultLocatorsObj.txtSunglasses.isDisplayed();	
		} else if(brand.equals("Rolex")) {
			EbaySearchresultLocatorsObj.txtWatches.isDisplayed();
		} else if(brand.equals("Chanel")) {
			EbaySearchresultLocatorsObj.txtPerfumes.isDisplayed();
		} else {
			System.out.println("Brand items not found");
		}
		Thread.sleep(4000); 
		
	}
	
	public void firstShirt() {
		EbaySearchresultLocatorsObj.linkShirtItem.click();
	}
	public void firstShoes() {
		EbaySearchresultLocatorsObj.linkMensShoes.click();	
		
	}
}
