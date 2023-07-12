package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySigninActions;

public class EbaySigninSteps {

	EbaySigninActions EbaySigninActionsObj = new EbaySigninActions();

	@When("^Click on Sign in$")
	public void click_on_Sign_in() throws Throwable {
		EbaySigninActionsObj.clickSignin();
	}

	@When("^Enter Email or user Name$")
	public void enter_Email_or_user_Name() throws Throwable {
		EbaySigninActionsObj.enterEmail();

	}
	
	@When("^Click Continue$")
	public void click_Continue() throws Throwable {
		EbaySigninActionsObj.clickContinue();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		EbaySigninActionsObj.enterPassword();
	}

	@When("^Click Sign-In$")
	public void click_Sign_In() throws Throwable {
		EbaySigninActionsObj.signIn();
	}

	@Then("^User Should able to Sign in$")
	public void user_Should_able_to_Sign_in() throws Throwable {
		EbaySigninActionsObj.verifySigninPage();
	}

}
