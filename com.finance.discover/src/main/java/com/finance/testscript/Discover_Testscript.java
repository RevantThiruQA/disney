package com.finance.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finance.pom.Object_LoginPage;
import com.finance.pom.Object_StatementPage;
import com.finance.util.Launchbrowser;

public class Discover_Testscript {
	private static WebDriver driver;
	
	@Test
	@Parameters({"UserName", "Password", "browser"})
	public void Login(String User, String Password, String browser) {
		driver = Launchbrowser.browse(browser, "https://www.discover.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Object_LoginPage home = PageFactory.initElements(driver, Object_LoginPage.class);
		home.login(User,Password);
		home.select();
		home.click();
	}
	
	@Test (dependsOnMethods = {"Login"})
	public void MovetoStatementPage(){
		Object_StatementPage statementpage = PageFactory.initElements(driver, Object_StatementPage.class);
		statementpage.ActivityandPayment();
		statementpage.Statements();
		statementpage.Logout();
		driver.quit();
	}
}
