package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartDropDownActions;

public class EbayCartDropDownSteps {

	EbayCartDropDownActions EbayCartDropDownActionsObj = new EbayCartDropDownActions();
	
	
	
	@When("^Select size type$")
	public void select_size_type() throws Throwable {
		EbayCartDropDownActionsObj.openNewWindow();
		EbayCartDropDownActionsObj.selectSize();
	}

	@When("^Select men size$")
	public void select_men_size() throws Throwable {
		EbayCartDropDownActionsObj.selectMenSize();
	}

	@When("^Select shade$")
	public void select_shade() throws Throwable {
		EbayCartDropDownActionsObj.selectShade();
	}

	@When("^Select quantity$")
	public void select_quantity() throws Throwable {
		EbayCartDropDownActionsObj.selectQuantity();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartDropDownActionsObj.shoppingCart();
	}
	
	
	
}
