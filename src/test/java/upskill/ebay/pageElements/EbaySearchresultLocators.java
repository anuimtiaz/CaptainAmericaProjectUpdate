package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchresultLocators {

	@FindBy(xpath = "//span[text()='Shoes']")
	public WebElement txtShoes;

	@FindBy(xpath = "//input[@aria-label='Gucci']")
	public WebElement clickGucci;

	@FindBy(xpath = "//input[@aria-label='Rolex']")
	public WebElement clickRolex;

	@FindBy(xpath = "//input[@aria-label='CHANEL']")
	public WebElement clickChanel;

	@FindBy(xpath = "//span[text()='Sunglasses']")
	public WebElement txtSunglasses;

	@FindBy(xpath = "(//span[text()='Watches'])[2]")
	public WebElement txtWatches;

	@FindBy(xpath = "//span[text()='Perfumes']")
	public WebElement txtPerfumes;

	// Select the first shirt on item list
	@FindBy(xpath = "//span[contains(text(),'Big & Tall Cotton Tee')]")
	public WebElement linkShirtItem;

	// Search Mans Crocs Shoes

	@FindBy(xpath = "(//span[contains(text(), 'Slip On Shoes')])[1]")
	public WebElement linkMensShoes;
	
//	@FindBy(xpath = "(//span[contains(text(), 'Classic Tie Dye Clogs')])[1]")
//	public WebElement linkMansShoes;

}
