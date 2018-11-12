package day20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDFCMobile {
	
			public static void main(String[] args) throws InterruptedException  {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.hdfcbank.com/");

			// Open second Login window
			driver.findElement(By.id("loginsubmit")).click();
			ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
			// click on Continue to NetBanking
			Thread.sleep(2000);
			driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
			
			driver.switchTo().frame("login_page");
			driver.findElement(By.partialLinkText("Know More")).click();
			//driver.findElement(By.cssSelector("body > form > table:nth-child(17) > tbody > tr > td:nth-child(3) > table > tbody > tr:nth-child(1) > td > table:nth-child(3) > tbody > tr > td:nth-child(1) > p > a")).click();
			Actions action = new Actions(driver);
			driver.switchTo().window(windows.get(3));
			WebElement Applynow =driver.findElement(By.cssSelector("#area-header > div > div.headerWrapper > div.navigation > ul > li.manage_your_money.applyWrap.selected > div.menutext > span"));
			//WebElement Applynow = driver.findElement(By.partialLinkText("Apply now"));
			 action.moveToElement(Applynow).build().perform();
	        driver.findElement(By.linkText("Personal Loan")).click();
	        //driver.switchTo().window(windows.get(4));
	        driver.findElement(By.id("txtmissing_18")).sendKeys("9999988888");
	        
	        
	        
			
			

}
}
