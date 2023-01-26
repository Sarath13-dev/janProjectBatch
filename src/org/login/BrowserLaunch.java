package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		//Set the Property of Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumJanuary23\\Driver\\chromedriver.exe");
		//Initiate the Browser
		WebDriver driver = new ChromeDriver();
		//To launch the url
		driver.get("https://www.facebook.com/");
		
		
	}

}
