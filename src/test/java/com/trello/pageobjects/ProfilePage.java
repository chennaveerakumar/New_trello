package com.trello.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage{
 //
	WebDriver driver;
 public ProfilePage(WebDriver driver) {
	 super(driver);
 }
 
 @FindBy(xpath = "//span[@title='Chennaveerakumar (chennaveerakumar)']")
 WebElement profileOption;
 
 @FindBy(xpath = "//span[text()='Profile and visibility']")
 WebElement profileAndVisibility;
 
 
 
 @FindBy(xpath = "//span[text()='Log out']")
 WebElement logout;
 
 @FindBy(id="logout-submit")
 WebElement lastLogout;
 
 @FindBy(css="div[class='m2N684FcksCyfT']")
 WebElement homePageImg;
 
 public void click_ProfileOption() {
	 profileOption.click();
 }
 public void click_profileAndVisibility() {
	 profileAndVisibility.click();
}
 public void click_logoutOption() {
	 logout.click();
	 lastLogout.click();
 }
 public boolean homePageTrelloImg() {
	 return homePageImg.isDisplayed();
 }
}
