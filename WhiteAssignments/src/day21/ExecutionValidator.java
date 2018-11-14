package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionValidator {
	WebDriver driver;
	String expected;
	String actual;

	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
	}
	
	@Test(priority=3)
	public void Method1() {
		expected= "LinkedIn: Log In or Sign Up";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=1)
	public void Method2() {
		boolean signInDisplayed = driver.findElement(By.id("login-password")).isDisplayed();
	    Assert.assertTrue(signInDisplayed);
	}
	@Test(priority=2)
	public void Method3() {
		 driver.findElement(By.id("login-email")).sendKeys("trial@gmail.com");
		 boolean isEntered = driver.findElement(By.id("login-email")).isEnabled();
		 Assert.assertTrue(isEntered);
		
	}
	
	
}
