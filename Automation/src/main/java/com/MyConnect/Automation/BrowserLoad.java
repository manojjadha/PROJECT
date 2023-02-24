package com.MyConnect.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.ByteString;



public class BrowserLoad {
	private static final String TimeUnit = null;
	private static final String ExpectedCondition = null;
	private static WebElement forgotpasswordLink;
	WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\THP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://myconnectv1.tinggit.com/");
			
			
			// Find the username and password in the login field them in
			WebElement usernameField = driver.findElement(By.id("username"));
			WebElement passwordField = driver.findElement(By.id("password"));
			// Enter the login credential
			usernameField.sendKeys("manoj.jadhav@thehigherpitch");
			usernameField.sendKeys("Sara@9090");
			//Find the click the login Button
			RemoteWebElement loginButton = (RemoteWebElement) driver.findElement(By.id("login Button"));
            loginButton.click();
            //wait for next pageto load using implicit wait
            driver.manage().timeouts().implicitlyWait(10,java.util.concurrent.TimeUnit.SECONDS);
            //verify that login was successfull By checking for 
            WebElement logoutButton = driver.findElement(By.id("logout"));
            if(logoutButton.isDisplayed()) {
            	
            	System.out.println("login successfull");
            }else {
            	System.out.println("login faield");
            	
            	//click on forget password
            	
            	WebElement emailField = driver.findElement(By.linkText("Forget password"));
            	forgotpasswordLink.click();
            	//enter a registred email adress or username
            	
            	WebElement emailField1 = driver.findElement(By.id("email"));
            	emailField.sendKeys("manoj.jadhav@thehigherpitch");
            	// click on the submit Button
            	WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'submit')]"));
            	submitButton.click();
            	//wait for password reset email to be sent
            	//access the email acount and click on the password reset on the "submitButton"
            	// verify that the password has been successfully change and the user is redirect to the login page 
            	String expecturl =" https://myconnectv1.tinggit.com/";
            	//set the driver path
            	
            	
            	System.setProperty("webdriver.chrome.driver","C:\\Users\\THP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            	//Create an instance of chromedriver
            	WebDriver driver1 = new ChromeDriver();
            	// Navigate to the URL where you icon is present
            	driver.get("https://myconnectv1.tinggit.com/");
            	//identify the connect icon element
            	WebElement connecticon = driver.findElement(By.id("connect-icon"));
            	// click on the connect icon
            	connecticon.click();
            	//wait for page to redirection
            	WebDriverWait wait = new WebDriverWait(driver,10);
            	wait.until(ExpectedConditions.urlContains("connect-page"));
            	//verify that webpage has been loaded after redirection
            	String currenturl = driver.getCurrentUrl();
            	if (currenturl.contains("connect-webpage")) {
            		
            	}
            	
        		
            	
            	
            	
            }
			
			
			
	}
	
	
}
