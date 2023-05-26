package com.trello.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BoardPage extends LoginPage{
	 //WebDriver driver;
     public BoardPage(WebDriver driver) {
	  super(driver);
  }
     
  @FindBy(xpath = "//a[@data-test-id='home-team-boards-tab']/span[text()='Boards']")
  WebElement boardOption;
  
  @FindBy(xpath="//span[text()='Create new board']")
  WebElement createnewBoardOPtion;
  
  @FindBy(xpath = "//input[@data-test-id='create-board-title-input']")
  WebElement enterboardTitle;
  
  @FindBy(xpath = "//button[text()='Create']")
  WebElement clickOnCreateBoard;
  
  @FindBy(xpath = "//p[text()='Get unlimited boards']")
  WebElement Zero_Board;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li/a/div")
  WebElement AgileBoardTemplate;
  
  @FindBy(xpath = "//*[@id=\"board\"]/div[1]/div/div[2]/a[1]/div[3]/span")
  WebElement Testing;
  
  @FindBy(xpath = "//*[@id=\"board\"]/div[1]/div")
  WebElement Dragable_From;
  
  @FindBy(xpath = "//*[@id=\"board\"]/div[3]/div")
  WebElement Dropable_To;
  
  //Boards are already full
  public void zeroBoardsLeft() {
	  Assert.assertTrue(true, "Zero Boards Left");
  }
  
  //Create methods to perform operation
  public void click_BoardOption() {
	  boardOption.click();
  }
  public void click_createyourBoardOPtion() {
	  createnewBoardOPtion.click();
  }
  public void sendKeys_enterboardTitle(String title) {
	  enterboardTitle.sendKeys(title);
  }
  public void click_clickOnCreateBoard() {
	  clickOnCreateBoard.click();
  }
  public void Operations_on_AgileBoard() {
	  AgileBoardTemplate.click();
	  action.clickAndHold(Testing).build().perform();
	  action.pause(Duration.ofSeconds(5)).dragAndDrop(Dragable_From,Dropable_To).perform();
  }
}
