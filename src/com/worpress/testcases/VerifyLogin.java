/**
 * 
 */
package com.worpress.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author dell
 *
 */
public class VerifyLogin {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(44, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	
	@Test
	public void verifyLoginPage() {
		
		LoginPage login=new LoginPage(driver);
		login.loginToWordpress("admin", "demo123");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
