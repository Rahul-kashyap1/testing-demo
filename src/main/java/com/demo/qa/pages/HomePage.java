package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;

public class HomePage extends TestBase {
//	
//	@FindBy(xpath = "//input[@name='email']")
//	WebElement email;
//	
//	@FindBy(xpath = "//input[@name='password']")
//	WebElement password;
//	
//	@FindBy(xpath = "//div[@class='ui fluid large blue submit button' and text()='Login']")
//	WebElement loginBtn;
//	
//	
//	public HomePage() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void loginPage(String user,String pass) {
//		email.sendKeys(user);
//		password.sendKeys(pass);
//		loginBtn.click();
//	}
	
	public String getTitle() {
		return driver.getTitle();
	
	
}
}
