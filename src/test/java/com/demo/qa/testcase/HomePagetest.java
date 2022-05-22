package com.demo.qa.testcase;




import org.testng.Assert;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.HomePage;


public class HomePageTest extends TestBase {

	HomePage homePage;
	String sheetName = "sheet1";
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialisation();
		homePage=new HomePage();
	}
	
	
	@Test
	public void getTitle() {
	String title=	homePage.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
