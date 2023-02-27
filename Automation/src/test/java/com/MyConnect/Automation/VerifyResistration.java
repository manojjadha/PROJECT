package com.MyConnect.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class VerifyResistration {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://myaccount.tinggit.com/login?callback=https://myconnectv1.tinggit.com/");
		
		driver.manage().window().maximize();
		
		ResistrationPage resistrationPage = new ResistrationPage (driver);
		
		resistrationPage.sendUserName();
		resistrationPage.sendPassword();
		resistrationPage.clickLoginButton();

  
		
		
	}

}
