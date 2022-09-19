package com.appointmanage.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.appointmanage.base.BaseClass;
import com.appointmanage.pom.IndexPagePom;

public class IndexPageText extends BaseClass {
	IndexPagePom indexPagePom;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		loadApplication();
		driver.get(prop.getProperty("baseurl"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void validateLogo() {
		indexPagePom = new IndexPagePom();
		boolean res = indexPagePom.validateLogo();
		Assert.assertTrue(res);
	}
	
	@Test
	public void signInPage()
	{
		indexPagePom = new IndexPagePom();
		indexPagePom.signInButton.click();
	}
	
	public void searchTextValue()
	{

		indexPagePom = new IndexPagePom();
		indexPagePom.searchTextValue();
	}
	
	
	/*	@Test
	public void test()
	{
		System.out.println("Open Webpage");
		softassert.assertEquals(false, true);
		System.out.println("logo check");
		System.out.println("title check");
		softassert.assertEquals(false, true);
		System.out.println("Click on sign in");
		softassert.assertAll();
	}
	
	
	*/
	
}

