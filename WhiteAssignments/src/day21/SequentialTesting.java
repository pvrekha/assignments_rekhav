package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SequentialTesting {
		
		WebDriver driver;

	@BeforeTest
	@Parameters("browser")


	   public void openBrowser(String browser) {
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equals("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.firefox.marionette","geckodriver.exe");
			 driver = new FirefoxDriver();
		}
					
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/");
		}
	@Test
	public void checkSignin() {
		boolean signInDisplayed = driver.findElement(By.id("login-submit")).isEnabled();
	    Assert.assertFalse(signInDisplayed);
		
		
	}
	}




