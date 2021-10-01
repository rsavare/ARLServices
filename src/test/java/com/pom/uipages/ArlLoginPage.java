package com.pom.uipages;

import org.openqa.selenium.By;

import com.seleniumLibrary.SeleniumFunction;

public class ArlLoginPage extends SeleniumFunction {
	
	public By userName = By.xpath("//span[text()='Submit']//preceding::input[2]");
	public By passWord = By.xpath("//span[text()='Submit']//preceding::input[1]");
	public By submitBtn = By.xpath("//span[text()='Submit']");
	
	ArlHomePage arl = new ArlHomePage();
	
	public void user_enters_the_username(String username) {
		  click(arl.signInLink);
		  wait(4);
		  enter(userName, username);
		}

		
		public void user_enters_the(String password) {
			enter(passWord, password);
		}

		
		public void click_on_the_sign_in_button() {
		    click(submitBtn);
		    wait(5);
		}

	
}
