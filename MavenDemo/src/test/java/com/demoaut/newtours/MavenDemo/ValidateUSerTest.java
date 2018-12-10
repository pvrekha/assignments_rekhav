package com.demoaut.newtours.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import reporter.PDFReport;

@Listeners(PDFReport.class)
public class ValidateUSerTest extends BaseTest{

	@Test
	public void userValidation() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		lp.applicationLogin("mercury", "mercury");

		boolean signOffStatus = ff.getSignOff().isDisplayed();
		Assert.assertTrue(signOffStatus);

	}

}
