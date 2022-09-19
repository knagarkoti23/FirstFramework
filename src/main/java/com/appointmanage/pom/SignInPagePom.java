package com.appointmanage.pom;

import org.openqa.selenium.support.PageFactory;

import com.appointmanage.base.BaseClass;

public class SignInPagePom extends BaseClass
{
	public SignInPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pageTitle()
	{
		String url = driver.getTitle();
		
	}
}

