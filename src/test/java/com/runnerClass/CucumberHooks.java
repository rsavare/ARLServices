package com.runnerClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends ScriptRunner {
	
	
	@Before
	public void initSetup() throws Throwable {
		//System.out.println("Inside cucumber Hooks Before");
		//beforeMethod();
	}
	
	@After
	public void end() {
//		System.out.println("Inside cucumber Hooks After");
//		closeBrowser();
	}

}
