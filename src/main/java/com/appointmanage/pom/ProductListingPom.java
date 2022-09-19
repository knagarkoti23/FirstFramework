package com.appointmanage.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.appointmanage.base.BaseClass;

public class ProductListingPom extends BaseClass
{
	Select select;
	
	public ProductListingPom()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="search_query_top")
	WebElement searchtextbox; 
	
	public void searchText()
	{
		String text = searchtextbox.getText();
	}
	
	
}
