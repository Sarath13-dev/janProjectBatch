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
		System.out.println("Dev Branch Work");
		System.out.println("Work Completed");
		System.out.println("Work Done by QA");
		System.out.println("Work completed by QA");
		System.out.println("Jenkins");
		driver.get("https://www.flipkart.com/");
		
		
		
	}

}
