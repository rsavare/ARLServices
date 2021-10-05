package com.stepDefinition;

import com.pom.uipages.ArlHomePage;
import com.pom.uipages.ArlLoginPage;
import com.pom.uipages.ArlMainPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArlParcel {
	
	ArlHomePage ahm = new ArlHomePage();
	ArlMainPage amp = new ArlMainPage();
	ArlLoginPage alp = new ArlLoginPage();
	
	
	@When("User Enters the URL \"([^\"]*)\"")
	public void user_enters_the_url(String url) {
		ahm.user_enters_the_url(url);
	}

	@When("User enters the username as \"([^\"]*)\"")
	public void user_enters_the_username(String username) {
	  alp.user_enters_the_username(username);
	}

	@When("user enters the password as \"([^\"]*)\"")
	public void user_enters_the(String password) {
	  alp.user_enters_the(password);
	}

	@Then("click on the SignIn button")
	public void click_on_the_sign_in_button() {
	   alp.click_on_the_sign_in_button();
	}

	@Then("validate user is on Home page")
	public void validate_user_is_on_home_page() {
	    amp.validate_user_is_on_home_page();
	}


}
