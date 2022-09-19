package com.appointmanage.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appointmanage.base.BaseClass;

public class IndexPagePom extends BaseClass {

	public IndexPagePom()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	public WebElement logo;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement signInButton;
	
	@FindBy(id="search_query_top")
	public WebElement searchProductBox;
	
	@FindBy(name = "submit_search")
	public WebElement searchButton;
	
	public boolean validateLogo()
	{
	if(logo.isDisplayed())
	{
	System.out.println("logo is available");
	return true;
	}
	else
	{
	return false;
	}
	}

	//to check the TITLE of page
	public String getTitleOfPage()
	{
	String getTitle = driver.getTitle();
	return getTitle;
	}
	
	
	//to click on Search tab
	public void searchBox()
	{
		searchProductBox.sendKeys("T-shirt");
	}
	
	public ProductListingPom searchButton()
	{
		searchButton.click();
		return new ProductListingPom();
		
	}

	//click on signin button
	public SignInPagePom clickSignin()
	{
		signInButton.click();
		return new SignInPagePom();
		
	}

	
	public String searchTextValue()
	{

		searchProductBox.sendKeys("t-shirt");
		String text = searchProductBox.getAttribute("value");
		System.out.println(text);
		if(text.equalsIgnoreCase(searchProductBox.getAttribute("value")))
		{
			System.out.println("Matches Text");
		}
		else
		{
			System.out.println("Does not match Text");
		}
		return text;
	}
 
	
/*	public void searchProductBox()
	{
	
		searchProductBox.sendkeys("t-shirt");
		
	}
	
	
	public void ValidateTitle()
	{
		
		String title = indexPagePom.getTitleOfPage();
		Assert
		
		
	}
	
	*/
	
	
}
