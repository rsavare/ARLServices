package com.pom.uipages;

import org.openqa.selenium.By;

import com.seleniumLibrary.SeleniumFunction;

public class ArlMainPage extends SeleniumFunction {
	
	public By logoutBtn = By.xpath("//span[text()='Log out']");
	
	public void validate_user_is_on_home_page() {
	    VerifyElementExists("Element is not present on the page", logoutBtn);
	}

}
