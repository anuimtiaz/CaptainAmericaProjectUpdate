package upskill.ebay.pageAction;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import upskill.ebay.pageElements.IframeLocators;
import upskill.utilities.SetupDrivers;

public class IframeActions {

	IframeLocators IframeLocatorsObj;

	public IframeActions() {
		IframeLocatorsObj = new IframeLocators();
		PageFactory.initElements(SetupDrivers.driver, IframeLocatorsObj);
	}

	public void shettyHomepage() throws Exception {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);

	}

	public void iframeHome() {

		// switchTo()---
		// findElement----One ELement ---clickHome;
		// findEleemnts method returns the first matching element on the current
		// webpage.
		// If the element is not found then it throws an exception
		// NoSuchElementsException
		// returns a single element
		// WebElement, can be access directly

		// findElements---More than one elements -ID(50), Class(70), List <WebElement>
		// frameList = new, Zero Elements
		// findelements method returns all the matching elements on the current
		// webpage and it doesn't throw any exception if the element in not found,
		// instead it will return zero elements.
		// returns a single element
		// List<WebElement>
		// access each item using for or foreach loop

		SetupDrivers.driver.findElement(By.id("courses-iframe"));

		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));

		for (int i = 0; i < framelist.size(); i++)
			SetupDrivers.driver.switchTo().frame(i);

		try {
			IframeLocatorsObj.clickHome.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Element not found in this iframe");
		}
	}

	public void verifyHomepage() {
		IframeLocatorsObj.clickHome.isDisplayed();
	}

}
