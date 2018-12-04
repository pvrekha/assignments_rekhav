package com.demoaut.newtours.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

import reporter.PDFReport;

@Listeners(PDFReport.class)
public class InvalidUserTest extends BaseTest{

	@Test
	public void userValidation() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		lp.applicationLogin("computer", "mercury");

		boolean signOnStatus = so.getSignOn().isDisplayed();
		Assert.assertFalse(signOnStatus);

	}

}
