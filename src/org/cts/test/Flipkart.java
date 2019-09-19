package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\windowhan\\lib\\selenium-server-standalone-3.141.59.jar");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	}

}
