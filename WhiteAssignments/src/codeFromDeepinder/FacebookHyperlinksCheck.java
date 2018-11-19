package codeFromDeepinder;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookHyperlinksCheck {

	WebDriver driver;
	private static int invalidLinks = 0;
	
	public static void verifyURLStatus(String URL) throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		HttpResponse response = client.execute(request);
		if (response.getStatusLine().getStatusCode() != 200) {
			
			invalidLinks++;
			System.out.println("Name of the invalid link = " + URL);
		}
	}

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
	}

	@Test
	public void allLinksTest() throws ClientProtocolException, IOException {
		WebElement bottomSection = driver.findElement(By.id("js_0"));
		List<WebElement> links = bottomSection.findElements(By.tagName("a"));
		System.out.println("Total number of links present = " + links.size());

		for (WebElement x : links) {
			String url = x.getAttribute("href");
			if (url != null) {
				verifyURLStatus(url);
			} else {
				invalidLinks++;
			}

		}

		System.out.println("Total number of invalid links = " + invalidLinks);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
