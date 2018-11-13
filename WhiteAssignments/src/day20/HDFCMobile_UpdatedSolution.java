package day20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HDFCMobile_UpdatedSolution {
	
	WebDriver driver;
	ArrayList<String> windows;

	@BeforeTest
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options); // First Window Opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
	}

	@Test
	public void switchControls() throws InterruptedException {
		// Open Second Window
		driver.findElement(By.id("loginsubmit")).click();
		// Create a List of window handles
		windows = new ArrayList<>(driver.getWindowHandles());
		for (String x : windows) {
			System.out.println(x);
		}
		driver.switchTo().window(windows.get(1));

		// Click on Continue to NetBanking in Child window
		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();

		// Switch Frame to click on Know More
		driver.switchTo().frame("login_page");

		// Click on Know More - 3rd window opens
		driver.findElement(By.cssSelector(
				"body > form > table:nth-child(17) > tbody > tr > td:nth-child(3) > table > tbody > tr:nth-child(1) > td > table:nth-child(3) > tbody > tr > td:nth-child(1) > p > a"))
				.click();

		// Switch focus to 3rd window
		windows = new ArrayList<>(driver.getWindowHandles());
		System.out.println(windows.size());
		for (String x : windows) {
			System.out.println(x);
		}
		driver.switchTo().window(windows.get(2));
		// driver.manage().window().maximize();

		// Mouse Hover over Apply
		WebElement applyNow = driver.findElement(By.cssSelector(
				"#area-header > div > div.headerWrapper > div.navigation > ul > li.manage_your_money.applyWrap > div.menutext"));
		Actions action = new Actions(driver);
		action.moveToElement(applyNow).build().perform();

		// Click on Personal Loan
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Personal Loan")));
		WebElement personalLoan = driver.findElement(By.linkText("Personal Loan"));
		action.click(personalLoan).build().perform();

		// Switch to 4th window
		windows = new ArrayList<>(driver.getWindowHandles());
		
		for (String t : windows) {

			if (driver.switchTo().window(t).getTitle().equals("Customer Digital Journey")) {
					driver.findElement(By.id("txtmissing_18")).sendKeys("9999988888");
			}

		}

	}

}
