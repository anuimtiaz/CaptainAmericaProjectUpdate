package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {

	Screenshots ScreenshotsObj = new Screenshots();
	
	@After
	public void afterActions(Scenario Scenario) throws Exception {
		
		if(Scenario.isFailed()){
			ScreenshotsObj.screenshotMethod();;
		}
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
		
		
		
		
		
		
	}
}