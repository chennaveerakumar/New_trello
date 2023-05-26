package com.trello.testcase;

import org.testng.annotations.Test;

import general.BaseClass;

public class Abc  extends BaseClass{
	
//	public LoginPage lp;
	
	
	
	public void firsttest() throws Throwable {
		System.out.println("this is from first test");
		
//		 LoginPage lp = new LoginPage(driver);
//		 LoginPage lp =new LoginPage(driver);
		lp.login("username", "password");
		
	}
	
	
//	@Test
//	public void firsttest1() throws Throwable {
//		System.out.println("this is from first test");
//		LoginPage lp = new LoginPage(driver);
		 
//		lp.jaibalayya("admin");
//		//input[@id='user']
//		WebElement newusername = driver.findElement(By.xpath("//input[@id='user']"));
//		lp.setUserName("hh");
//		lp.getUserName().sendKeys("asdflkasjdflksjadflkdsaj");
//		
//	}
	
	public void firsttest2() throws Throwable {
		System.out.println("this is from first test");
		
//		 LoginPage lp = new LoginPage(driver);
		lp.login("username", "password");
	}

}
