package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {

	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(2)")
	private WebElement businessClass;

	@FindBy(name = "airline")
	private WebElement flight;

	@FindBy(name = "findFlights")
	private WebElement submit;

	@FindBy(linkText = "SIGN-OFF")
	private WebElement signOff;
	
	public FlightFinder(WebDriver x) {
		PageFactory.initElements(x, this);
	}

	public void findFlight() {
		businessClass.click();
		Select drpDown = new Select(flight);
		drpDown.selectByIndex(2);
		submit.click();
	}
	
	public WebElement getSignOff() {
		return signOff;
	}

	

}
