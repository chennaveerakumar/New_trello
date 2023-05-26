package com.trello.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.trello.pageobjects.ProfilePage;

import general.BaseClass;
import junit.framework.Assert;

public class TC_03 extends BaseClass {
	
	ProfilePage pg;
	@Test(priority = 1)
  public void ProfileMethod() throws Throwable {
	  pg=new ProfilePage(driver);
	  pg.login(uname, password);
	 
	  pg.click_ProfileOption();
	  Thread.sleep(2000);
	  pg.click_profileAndVisibility();
	  Thread.sleep(2000);
	  assertEquals(driver.getTitle(),"Profile | Trello");
	  Reporter.log("Title is correct and verified");
  }
	@Test(priority = 2)
	public void profileTrelloImg() {
		boolean img = pg.homePageTrelloImg();
		Assert.assertTrue(img);
	}
	
}
