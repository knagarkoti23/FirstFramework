package com.appointmanage.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appointmanage.base.BaseClass;

public class CreateAccountPagePom extends BaseClass
{
	
	public CreateAccountPagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className="id_gender1")
	public WebElement id_gender1;

	@FindBy(id="id_gender2")
	public WebElement id_gender2;

	@FindBy(id="customer_firstname")
	public WebElement custFirstName;

	@FindBy(id="customer_lastname")
	public WebElement custLastName;

	@FindBy(id="email")
	public WebElement email;

	@FindBy(id="passwd")
	public WebElement passwd;

	@FindBy(id="days")
	public WebElement days;

	@FindBy(id="months")
	public WebElement months;

	@FindBy(id="year")
	public WebElement year;

	@FindBy(id="firstname")
	public WebElement firstname;

	@FindBy(id="lastname")
	public WebElement lastname;

	@FindBy(id="company")
	public WebElement company;

	@FindBy(id="address1")
	public WebElement address1;

	@FindBy(id="address2")
	public WebElement address2;

	@FindBy(id="city")
	public WebElement city;

	@FindBy(id="id_state")
	public WebElement id_state;

	@FindBy(id="postcode")
	public WebElement postcode;

	@FindBy(id="id_country")
	public WebElement id_country;

	@FindBy(id="phone")
	public WebElement phone;

	@FindBy(id="phone_mobile")
	public WebElement phone_mobile;

	@FindBy(id="alias")
	public WebElement alias;

	@FindBy(id="newsletter")
	public WebElement newsletter;

	@FindBy(id="optin")
	public WebElement optin;

	@FindBy(id="submitAccount")
	public WebElement submitAccount;
	

}
