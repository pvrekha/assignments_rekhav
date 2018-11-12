package day20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetBanking {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");

		// Open second Login window
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		// click on Continue to NetBanking
		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
		// driver.findElement(By.cssSelector("body > div.full_container > div.container
		// > div.pdtb25.text-center > a")).click();
		// driver.switchTo().window(windows.get(2));
		 driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("35426789");

	}

}
