package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageAction;

public class EbayHomepageSteps {

	EbayHomepageAction EbayHomepageActionObj = new EbayHomepageAction();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
	EbayHomepageActionObj.searchShoes();
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionObj.searchItems(items);

	}

	@Given("^Search for Big & Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomepageActionObj.bigTallTee();
	}

	@Given("^Search for Mens Shoes$")
	public void search_for_Mans_Shoes() throws Throwable {
		EbayHomepageActionObj.searchMensShoes();
	}

	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionObj.mousehoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionObj.clickOnSummary();
	}

}
