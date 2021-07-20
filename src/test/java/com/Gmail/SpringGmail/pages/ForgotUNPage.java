package com.Gmail.SpringGmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;
@Component
public class ForgotUNPage {
	private WebDriver driver; 

	@FindBy(xpath="//button[text()='Forgot email?']")
	private WebElement forgotEmail;

	public ForgotUNPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void forgotEmailFlow() {
		forgotEmail.click();
	}
	
}
