package com.Gmail.SpringGmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.Gmail.SpringGmail.util.Env;

@Component
public class LoginPage {

@Value("${url}")
private String url;

@Value("${user}")
private String username;

@Value("${pwd}")
private String pwd;

private WebDriver driver; 

@FindBy(id="identifierId")
private WebElement emailId;

@FindBy(name="password")
private WebElement password;

@FindBy(xpath="//*[@id='identifierNext']/div/button/span")
private WebElement emailnext;

@FindBy(xpath="//*[@id='passwordNext']/div/button/span")
private WebElement pwdnext;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}




public void launch() throws InterruptedException {
	
	System.out.println("Login to Gmail with :" + url);
	driver.get(url);
	Thread.sleep(3000);
}

public void setUser() throws InterruptedException {
	
	emailId.sendKeys(username);
	/*emailnext.click();
	Thread.sleep(3000);
	password.sendKeys(pwd);
	pwdnext.click();
	Thread.sleep(3000);*/
}


}
