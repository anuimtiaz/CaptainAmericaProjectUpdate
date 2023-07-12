package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchresultAction;

public class EbaySearchresultSteps {
	
	EbaySearchresultAction EbaySearchresultActionObj = new EbaySearchresultAction();
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchresultActionObj.verifyShoes();
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchresultActionObj.filterBrand(brand);
	}
	
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchresultActionObj.verifyBrandItems(brand);
	}
	
	@When("^Select the first shirt on the items$")
	public void select_the_first_shirt_on_the_items() throws Throwable {
		EbaySearchresultActionObj.firstShirt();
	}
	@When("^Select the first shoes$")
	public void select_the_first_shoes() throws Throwable {
		EbaySearchresultActionObj.firstShoes();
	}

	
	
}
