package com.appointmanage.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.appointmanage.base.BaseClass;
import com.appointmanage.pom.CreateAccountPagePom;

public class CreateAccountPageTest extends BaseClass
{
	@BeforeMethod
	public void setUp() {
		loadApplication();
		driver.get(prop.getProperty("signinpage"));
		driver.manage().window().maximize();
		CreateAccountPagePom cap = new CreateAccountPagePom();

		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
	
	// validating all methods
	public void validateCreateAccountPage()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
