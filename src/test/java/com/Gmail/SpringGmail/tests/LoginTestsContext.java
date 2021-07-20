package com.Gmail.SpringGmail.tests;

import org.testng.annotations.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.Gmail.SpringGmail.SpringGmailApplication;
import com.Gmail.SpringGmail.SpringGmailApplicationTests;
import com.Gmail.SpringGmail.pages.LoginPage;
import com.Gmail.SpringGmail.util.Config;

//https://faun.pub/leverage-springs-dependency-injection-for-ui-automation-e32d1d82f738
//https://www.youtube.com/watch?v=RbGMqA8XPaE

public class LoginTestsContext extends SpringGmailApplicationTests {
	
	
	
	

	@Test
	public void testlogin() throws BeansException, InterruptedException {
		
		
		
		context.getBean(LoginPage.class).launch();;
		
		
	}
}
