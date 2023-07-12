package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.RestApiActions;

public class RestApiSteps {
	
	RestApiActions RestApiActionsObj = new RestApiActions();
	
	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		RestApiActionsObj.createPet();
	}

	@Given("^Get pet$")
	public void get_pet() throws Throwable {
		RestApiActionsObj.getPet();
	}

	@When("^Update the pet$")
	public void update_the_pet() throws Throwable {
		RestApiActionsObj.updatePet();
	}

	@Then("^Delete the pet$")
	public void delete_the_pet() throws Throwable {
		RestApiActionsObj.deletePet();
	}
	
	
	
}
