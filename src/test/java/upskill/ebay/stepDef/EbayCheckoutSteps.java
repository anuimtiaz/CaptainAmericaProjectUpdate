package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCheckoutActions;

public class EbayCheckoutSteps {
	
	EbayCheckoutActions EbayCheckoutActionsObj = new EbayCheckoutActions();
	
	@When("^Select color$")
	public void select_color() throws Throwable {
		EbayCheckoutActionsObj.openNewTab();
		EbayCheckoutActionsObj.selectColour();
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		EbayCheckoutActionsObj.selectSize();
	}
	
	@When("^Select amount$")
	public void select_amount() throws Throwable {
		EbayCheckoutActionsObj.selectAmount(); 
	}

	@Then("^Add to buy it now$")
	public void add_to_buy_it_now() throws Throwable {
		EbayCheckoutActionsObj.buyItNow();
	}

}
