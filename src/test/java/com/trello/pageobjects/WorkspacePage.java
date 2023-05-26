package com.trello.pageobjects;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class WorkspacePage extends LoginPage{
	  private WebDriver driver;
      public WorkspacePage(WebDriver driver) {
    	  super(driver);
      }
      
      @FindBy(xpath = "//button[@aria-label='Create a Workspace']")
      private WebElement createWorkspace;
      
      @FindBy(xpath = "//input[@type='text']")
      WebElement workspaceName;
      @FindBy(xpath = "//div[@class=' css-11unzgr']")
      private List<WebElement>selectedType;
      
      @FindBy(xpath = "//form[@class='TsS8IdouV7hSHL']//div[text()='Choose…']")
      private WebElement WorkspaceType;
      
      @FindBy(xpath = "//button[@type='submit']")
      private WebElement continueButton;
      
      @FindBy(xpath = "//input[@class='autocomplete-input']")
      private WebElement inviteLink;
      
      @FindBy(xpath = "//button[text()='Invite to Workspace']")
      private WebElement invitedOption;
      public void clickonCreateWorkspace() throws Throwable {
    	  createWorkspace.click();
      }
      public void passWorkspaceTitle() {
    	  workspaceName.sendKeys("QA-2020");
      }
      public void workspaceType() {
// It is look like drop down But it is not bcz it can't contain SELECT tag 
// if we try to use forcefully it will Give ====UNCHECKED-TAGNAME-EXCEPTION
    	  WorkspaceType.click();
    	  for(WebElement eles:selectedType)
    	  {
    		  String ele = eles.getText();
    		  System.out.println(ele);
    	  }
    	  
      }
      public void clickOnContinue() {
    	  continueButton.submit();
      }
          
      public void InvitingMailId_Continue(String email) {
    	  inviteLink.sendKeys(email);
    	  invitedOption.click();
      }
      
     
}
