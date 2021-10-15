package com.runnerClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature"},
		glue = {"com.stepDefinition"},
		tags = "@arlservice",
		dryRun = false,
		monochrome= true
		) 
   
public class ScriptRunner {
	
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	 public static String browser;
	 public static String url;
	 public static String uname;
	 public static String pwd;
	
	
	public static ThreadLocal<RemoteWebDriver> threadDriver = new ThreadLocal<RemoteWebDriver>();
	
	@BeforeClass
	public static void beforeMethod() throws Exception{
		
		File file = new File("D://Automation Frameworks//ARLServices//src//test//resources//DataFiles//config.properties");
		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream(file);
		prop.load(fip);
		
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		uname = prop.getProperty("username");
		pwd = prop.getProperty("password");
		
		threadDriver.set(createWebDriver(browser));
		//createWebDriver(browser);
	}
	
	
	
	
	  public static RemoteWebDriver getWebDriver() {
	  System.out.println("Webdriver: "+threadDriver.get()); 
	  return threadDriver.get(); 
	  }
	 
	
	public static RemoteWebDriver createWebDriver(String browserType) {
		System.out.println("The browser used is :"+browserType);
		
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = initChromeDriver();
		}else if(browserType.equalsIgnoreCase("edge")) {
			driver = initMSEdgeDriver();
		}
		
		return driver;
	}
	
	public static RemoteWebDriver initChromeDriver() {
		try {
			System.out.println("Launching the Browser");
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("D://Automation Frameworks//ARLServices//src//test//resources//Drivers//chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static RemoteWebDriver initMSEdgeDriver() {
		try {
			System.out.println("Launching the Browser");
			System.setProperty("webdriver.chrome.driver", System.getProperty("D://Automation Frameworks//ARLServices//src//test//resources//Drivers//chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	//@AfterClass
	public static void closeBrowser() {
		System.out.println("Closing the Browser");
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	 public static WebDriverWait setWait() { 
		 if(wait==null) { 
			 wait = new WebDriverWait(driver,80); 
	 } 
	 return wait; 
	 }
	 

}
