package com.Gmail.SpringGmail.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import com.Gmail.SpringGmail.pages.ForgotUNPage;
import com.Gmail.SpringGmail.util.Config;

public class ForgotUNTests extends BaseTests{
	
	@Test
	public void forgotUNcheck() throws InterruptedException {
		Thread.sleep(3000);
		forgotUNPage.forgotEmailFlow();
		Thread.sleep(3000);
	}

}
