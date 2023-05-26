package com.trello.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.trello.pageobjects.LoginPage;

import general.BaseClass;
import junit.framework.Assert;

public class TC_01 extends BaseClass {
	LoginPage lg;
	@Test(priority = 3)
   public void loginMethod() throws Throwable {
	   lg=new LoginPage(driver);
	   lg.login(uname, password);
	   Thread.sleep(3000);
	   assertEquals(driver.getTitle(), "Boards | Trello");
	   Reporter.log("User is successfully entered into home page");
	   
   }
	
	@Test(priority = 2)
	public void loginTitle() {
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Log in to Trello");
	}
	@Test(priority = 1) 
	public void loginTrelloImg() {
		boolean img = lg.validateTrelloImg();
		Assert.assertTrue(img);
	}
}
