package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import upskill.utilities.SetupDrivers;

public class EbayHomepageLocators {

	@FindBy (xpath="//input[@placeholder='Search for anything']")
	public WebElement txtSearch;
	
	
	@FindBy (xpath="//input[@value='earch']")
	public WebElement btnSearch;
	
	@FindBy(xpath ="//a[@title='My eBay']")
	public WebElement mousehoverEbay;
	
	
	@FindBy(xpath="//a[text()=' Summary']")
	public WebElement clickSummary;
	


	
	
}
