package com.demoaut.newtours.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//private WebElement user = driver.findElement(By.name("userName"));

	@FindBy(name="userName")
	@CacheLookup
	private WebElement user;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(name="login")
	@CacheLookup
	private WebElement submit;
	
	public Login(WebDriver x) {
		PageFactory.initElements(x, this);
	}
	
	public void applicationLogin(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
	
	

}
