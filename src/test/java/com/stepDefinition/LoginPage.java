package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.runnerClass.ScriptRunner;
import com.seleniumLibrary.SeleniumFunction;

import io.cucumber.java.en.Given;

public class LoginPage extends SeleniumFunction {
	
	
	
	


	String url = ScriptRunner.url;
	String username = ScriptRunner.uname;
	String password = ScriptRunner.pwd;
	
	public By userName_id = By.xpath("//span[text()='Submit']//preceding::input[2]");
	public By passWord_id = By.xpath("//span[text()='Submit']//preceding::input[1]");
	public By submitBtn = By.xpath("//span[text()='Submit']");
	public By signInBtn = By.xpath("//span[text()='Sign in']");
	public By logOutBtn = By.xpath("//span[text()='Log out']");
	
	
	@Given("^user is logged in with valid Credentials$")
	public void user_is_logged_in_with_valid_Credentials() {
		
		
		
		/*
		 * if(ScriptRunner.wait==null) { ScriptRunner.setWait(); }
		 */
		 
		
		if(isElementExist(signInBtn)) {
			
			
			System.out.println("Entering the URL :"+url);
			System.out.println("Entering the Username");
			enter(userName_id, username);
			System.out.println("Entering the password");
			enter(passWord_id, password);
			System.out.println("Clicking on Login Button");
			click(submitBtn);
			wait(4);
			VerifyElementExists("user is not logged in ", logOutBtn);
		}
	}

}
