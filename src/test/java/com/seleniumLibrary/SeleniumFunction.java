package com.seleniumLibrary;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.runnerClass.ScriptRunner;


public class SeleniumFunction {
	
	public static RemoteWebDriver driver= ScriptRunner.driver;
	
	
	
	public void naviagtetoURL(String url) {
		driver.navigate().to(url);
	}
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch (InterruptedException e){
			System.out.println("Faile to wait for "+seconds+" Seconds");
		}
	}
	
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (WebDriverException e)
		{
			wait(3);
			driver.findElement(locator).click();
			}
		}
	
	public boolean isElementEnable(By locator) {
		wait(3);
		return driver.findElement(locator).isEnabled();
	}
	
	public void enter(By locator, String text) {
		if(!isElementEnable(locator)) {
			wait(5);
		}
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
	
	public boolean isElementExist(By locator) {
		wait(2);
		try {
		driver.findElement(locator);
		return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void verifyValues(String msg, boolean expected, boolean actual) {
		Assert.assertEquals(msg,expected,actual);
	}
	
	public void VerifyElementExists(String msg, By locator) {
		verifyValues(msg, true, isElementExist(locator));
	}

}
