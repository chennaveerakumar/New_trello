package com.trello.testcase;

import org.testng.annotations.Test;

import com.trello.pageobjects.BoardPage;
import general.BaseClass;

public class TC_02 extends BaseClass{
	BoardPage bp;
	
     @Test
	 public void BoardOperation() throws Throwable {
    	 bp=new BoardPage(driver);
 		 bp.login(uname, password);
		 bp.Operations_on_AgileBoard(); 
	   }
	
//	public void createdBoard() throws Throwable  {
//		
//         //create board
////		 bp.click_BoardOption();
////		 Thread.sleep(2000);
////		 bp.click_createyourBoardOPtion();
////		 Thread.sleep(2000);
////		 bp.sendKeys_enterboardTitle(title);
////		 bp.click_clickOnCreateBoard();
//		
////		 driver.navigate().back();
////		 ProfilePage pg=new ProfilePage(driver);
////		 Thread.sleep(3000);
////		  pg.click_logoutOption();
////		  Thread.sleep(5000);
//		// driver.findElement(By.xpath("//h1[text()='cvk']"));
//	}
	 
	  
	   
}
