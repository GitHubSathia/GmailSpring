 package com.Gmail.SpringGmail.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.Gmail.SpringGmail.pages.ForgotUNPage;
import com.Gmail.SpringGmail.pages.LoginPage;


@ComponentScan(basePackages="com.Gmail.SpringGmail.pages")
@PropertySource("classpath:application.properties")

public class Config {
public static WebDriver driver;


/*@Bean
public Env env() {
	return new Env();
}*/

//https://faun.pub/leverage-springs-dependency-injection-for-ui-automation-e32d1d82f738
@Bean
public WebDriver webDriver() {
	System.setProperty("webdriver.gecko.driver", "C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	return driver;
}
/*@Bean
public WebDriver webDriver() {
  return new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),
      getCapabilities());
}*/

/*@Bean
public LoginPage loginpage() {
	return new LoginPage(driver);
}

@Bean
public ForgotUNPage forgotUNPage() {
	return new ForgotUNPage(driver);
}*/

}


