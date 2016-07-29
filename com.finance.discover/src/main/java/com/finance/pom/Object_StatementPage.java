package com.finance.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Object_StatementPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-wrapper']/div[1]/ul/li[2]/a")
	WebElement ActivityandPayment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-wrapper']/div[1]/ul/li[2]/div/div[1]/div/ul/li[2]/a")
	WebElement Statements;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = ".//*[@id='navbar-wrapper']/div[2]/ul/li[6]/a")
	WebElement Logout;

	public void ActivityandPayment() {
		ActivityandPayment.click();
	}

	public void Statements() {
		Statements.click();
	}
	
	public void Logout(){
		Logout.click();
	}

	public Object_StatementPage(WebDriver driver) {
		this.driver = driver;
	}
}