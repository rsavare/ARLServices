package com.pom.uipages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.seleniumLibrary.SeleniumFunction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArlHomePage extends SeleniumFunction {
	
	//Find out all the elements present in the ARL Home Page
	
	


	public By headerLogo= By.xpath("//*[text()='menu']//following::span[text()='Logistics Application'][2]");
	public By signInLink = By.xpath("//span[text()='Sign in']");
	public By footerLogo = By.xpath("//span[text()='Footer Logistics Application.']");
	
	
	public void user_enters_the_url(String url) {
	   naviagtetoURL(url);
	   wait(5);
	}
}
