package com.trello.testcase;

import org.testng.annotations.Test;

import com.trello.pageobjects.WorkspacePage;

import general.BaseClass;

@Test
public class TC_04 extends BaseClass {
	WorkspacePage ws;
	public void workspaceMethod() throws Throwable {
	    ws=new WorkspacePage(driver);
	    ws.login(uname, password);
	    ws.clickonCreateWorkspace();
	    ws.passWorkspaceTitle();
	    ws.workspaceType();
	    ws.clickOnContinue();
	    System.out.println(email);
	    ws.InvitingMailId_Continue(email);
	 
   }
}
