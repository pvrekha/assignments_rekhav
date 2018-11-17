package day22;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Printlinks {
	
WebDriver driver;

	@BeforeTest()
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
		
	@Test
	public void findLinks() {
		List<WebElement> link = driver.findElements(By.cssSelector("#js_0 > ul"));
		//LinkedList<String>links = new LinkedList<>();
		//for (Object  x: link ) {
		//	System.out.println(x);
		for(int i=0; i<link.size();i++) {
			System.out.println("Printing links  " +link.get(i).getText());
		}
				}
		}
	

/*Good. The logic is correct but here you had to print the names of links from bottom section, so don't write 
*driver.findElements, instead locate the bottom section in a variable and then write bottomSection.findElements()
*/