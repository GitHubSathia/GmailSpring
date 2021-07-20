package com.Gmail.SpringGmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Gmail.SpringGmail.pages.LoginPage;
import com.Gmail.SpringGmail.util.Config;
import com.Gmail.SpringGmail.util.ConfigContext;



@SpringBootTest(classes = ConfigContext.class)

public class SpringGmailApplicationTests  {
	public static AnnotationConfigApplicationContext context;
	
	@BeforeMethod
	public void getBaeanNew() {
		 context=new AnnotationConfigApplicationContext(ConfigContext.class);
		 
	}
	
	 /* public static <T> T getBean(Class<T> beanClass) {
	        return context.getBean(beanClass);
	    }*/




	
}
