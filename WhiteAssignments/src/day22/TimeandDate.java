package day22;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeandDate {

	WebDriver driver;

	public static boolean dateValidity(String date) {
		boolean validation = true;
		try {
			DateTimeFormatter formatter = DateTimeFormat.forPattern("MMM dd, yyyy");
			DateTime currentTime = formatter.parseDateTime(date);
		} catch (Exception e) {
			validation = false;
		}
		return validation;
	}

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
	}

	@Test
	public void dateVerification() throws InterruptedException {
		// String date = driver.findElement(By.id("ij2")).getText();
		String date = driver.findElement(By.cssSelector("#ij2")).getText();
		Thread.sleep(2000);
		// String date = driver.findElement(By.xpath(("//span[contains(@id='ij2']"))));
		System.out.println(date);
		Assert.assertTrue(dateValidity(date));
	}

}
//Excellent