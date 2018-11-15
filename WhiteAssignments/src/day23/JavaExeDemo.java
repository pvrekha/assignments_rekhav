package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaExeDemo {

	WebDriver driver;

	@BeforeTest()
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void signIndemo() {

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement username = driver.findElement(By.name("userName"));
		 js.executeScript("document.getElementsByName('userName').value ='abc@gmail.com'");
		//js.executeScript("arguments[0].value ='abc@gmail.com';", username);
		WebElement Password = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value ='password';", Password);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", login);

	}

	@AfterTest
	public void close() {
		driver.close();

	}

}
