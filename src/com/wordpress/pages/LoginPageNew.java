package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	 WebDriver driver;
	@FindBy(how=How.ID,using="user_login")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	WebElement loginButton;
	public LoginPageNew(WebDriver driver) {
		this.driver=driver;
	}
	public void newLogInToWordPress(String uname,String upwd) {
		username.sendKeys(uname);
		password.sendKeys(upwd);
		loginButton.click();
	}
}
