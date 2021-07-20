package com.Gmail.SpringGmail.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.Gmail.SpringGmail.SpringGmailApplication;
import com.Gmail.SpringGmail.SpringGmailApplicationTests;
import com.Gmail.SpringGmail.pages.ForgotUNPage;
import com.Gmail.SpringGmail.pages.LoginPage;
import com.Gmail.SpringGmail.util.Config;
import com.Gmail.SpringGmail.util.Env;

//https://stackoverflow.com/questions/53576994/why-bean-are-not-injected-in-test-class
@SpringBootTest(classes = Config.class)

public class BaseTests extends AbstractTestNGSpringContextTests {
	
	@Autowired
	public WebDriver webDriver;
	
	
	@Autowired
	public LoginPage loginPage;
	
	@Autowired
	protected ForgotUNPage forgotUNPage;
	
	@BeforeMethod
	public void launchApp() throws InterruptedException {
		
		loginPage.launch();	
		
	}
	
	@AfterMethod
	public void closeAll() {
		webDriver.quit();
	}
}
