package com.Gmail.SpringGmail.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;
@Component
//This class not required. Handled in @Config for WebDriver
//https://faun.pub/leverage-springs-dependency-injection-for-ui-automation-e32d1d82f738
public class Env {
public static WebDriver driver;
public Env() {
	
}
public  WebDriver createDriver(String browesrName) {
	System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	return driver;
	
}
}
