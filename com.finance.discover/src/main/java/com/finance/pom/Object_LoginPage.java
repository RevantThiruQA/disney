package com.finance.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Object_LoginPage {
	WebDriver driver1;
	@FindBy(how = How.XPATH, using = ".//*[@id='userid-content']")
	WebElement username;
	@FindBy(how = How.XPATH, using = ".//*[@id='password-content']")
	WebElement password;
	@FindBy(how = How.NAME, using = "choose-card")
	WebElement card;
	@FindBy(how = How.XPATH, using = ".//div/*[@id='log-in-button']")
	WebElement login;

	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		// card.click();

	}

	public void select() {
		Select creditcard = new Select(card);
		creditcard.selectByVisibleText("Credit Card");
	}

	public void click() {
		login.click();
	}

	public Object_LoginPage(WebDriver driver) {
		this.driver1 = driver;

	}
}
