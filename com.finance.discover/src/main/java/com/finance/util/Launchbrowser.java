package com.finance.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchbrowser {

	static WebDriver driver;

	public static WebDriver browse(String str, String url) {
		if (str.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (str.equalsIgnoreCase("chrome")) {
			System.setProperty("driver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (str.equalsIgnoreCase("IE")){
			System.setProperty("driver.IE.driver", "C:\\Softwares\\IEdriver_win32\\IEdriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();

		return driver;

	}

}
