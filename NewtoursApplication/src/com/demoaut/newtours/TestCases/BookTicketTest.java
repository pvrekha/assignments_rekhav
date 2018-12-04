package com.demoaut.newtours.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

import reporter.PDFReport;

@Listeners(PDFReport.class)
public class BookTicketTest extends BaseTest {

	@Test
	public void ticketBookingTest() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);

		lp.applicationLogin("mercury", "mercury");
		ff.findFlight();
		sf.flightSelection();
		bf.flightBooking("Deepinder", "Bhatti", "111--222--333");

		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getSuccessMessage().getText();

		Assert.assertEquals(actualMessage, expectedMessage);

	}

}
