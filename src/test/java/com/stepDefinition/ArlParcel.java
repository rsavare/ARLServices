package com.stepDefinition;

import com.pom.uipages.ArlHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArlParcel {
	
	ArlHomePage ahm = new ArlHomePage();
	
	@When("User Enters the URL \"([^\"]*)\"")
	public void user_enters_the_url(String url) {
	    
	}

	@When("User enters the username as \"([^\"]*)\"")
	public void user_enters_the_username(String username) {
	  
	}

	@When("user enters the password as \"([^\"]*)\"")
	public void user_enters_the(String password) {
	  
	}

	@Then("click on the SignIn button")
	public void click_on_the_sign_in_button() {
	   
	}

	@Then("validate user is on Home page")
	public void validate_user_is_on_home_page() {
	    
	}


}
