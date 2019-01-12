package com.worpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;

import helper.BrowserFactory;

public class VerifyNewLogin {

	@Test
	public void test() {
		WebDriver driver=BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		LoginPageNew log=PageFactory.initElements(driver, LoginPageNew.class);
		log.newLogInToWordPress("admin", "demo123");
		System.out.println("Log in successful");
	}
}
