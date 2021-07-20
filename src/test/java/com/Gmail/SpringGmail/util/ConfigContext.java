package com.Gmail.SpringGmail.util;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.Gmail.SpringGmail.pages.LoginPage;


@ComponentScan(basePackages="com.Gmail.SpringGmail.pages")
@PropertySource("classpath:application.properties")

public class ConfigContext {


}



