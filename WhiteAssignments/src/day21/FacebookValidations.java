package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookValidations {
	
	WebDriver driver;
	String expected;
	String actual;
	
	@BeforeTest()
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority =3)
	public void verifyTitle() {
		expected= "Facebook - Log In or Sign Up";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority =2,enabled=false)
	public void checkFirstName() {
		boolean expected = driver.findElement(By.name("firstname")).isDisplayed();
		Assert.assertTrue(expected);
			}

    @Test(priority =1)
    public void birthdayHelpdisplay() {
    	boolean expectedhelp = driver.findElement(By.linkText("Why do I need to provide my birthday?")).isDisplayed();
    	Assert.assertTrue(expectedhelp);
    }

    @Test(priority =4)
    public void createPagecheck() {
    	boolean pageCheck = driver.findElement(By.linkText("Create a Page")).isEnabled();
    	Assert.assertTrue(pageCheck);
    }

 @AfterTest
 public void close() {
     driver.close();
 }


}