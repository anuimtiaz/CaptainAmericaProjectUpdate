package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCheckoutLocators {

	@FindBy(xpath="//select[@aria-label='Please select a Color']")
	public WebElement ddColour;
	
	@FindBy(xpath="//select[@selectboxlabel='Size']")
	public WebElement ddSize;
	
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtBxQty;

	@FindBy(xpath="//span[text()='Buy It Now']")
	public WebElement clickBuyNow;
	
//	@FindBy(xpath="//h1[text()='Checkout']")
//	public WebElement txtCheckout;
}
