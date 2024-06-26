package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver Driver) {
		driver = Driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "username")
	WebElement usernameField;
	
	@FindBy (name = "password")
	WebElement passwordField;
	
	@FindBy (xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	
	@FindBy (xpath = "//span[text()='Manu ']")
	WebElement clickForLogOut;
	
	@FindBy (linkText = "Logout")
	WebElement logOutButton;
	
	public void enteruserName(String userName) 
	{
		usernameField.clear();
		usernameField.sendKeys(userName);
	}
	
	public void enterPWD(String pwd) 
	{
		passwordField.clear();
		passwordField.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() 
	{
		signInButton.click();
	}
	
	public void clickOnLogOutButton() 
	{
		clickForLogOut.click();
		logOutButton.click();
	}

}
