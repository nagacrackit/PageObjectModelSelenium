/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author dell
 *
 */
public class LoginPage {
	
	WebDriver driver;
	//find out web element locators
	//username web element
	By username=By.id("user_login");
	By password=By.name("pwd");
	By loginButton=By.xpath("//input[@value='Log In']");
	
	//instantiating webdriver
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginToWordpress(String uname,String upwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(upwd);
		driver.findElement(loginButton).click();
	}
	
}
	