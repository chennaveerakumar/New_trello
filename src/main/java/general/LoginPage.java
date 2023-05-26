package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   WebDriver driver;
   public LoginPage(WebDriver driver){
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//input[@id='user']")
   WebElement userName;
   
   @FindBy(xpath = "//input[@type='submit']")
   WebElement continueButton;
   
   @FindBy(xpath = "//input[@id='password']")
   WebElement pwd;
   
   @FindBy(xpath = "//button[@type='submit']")
   WebElement loginButton;
   
   @FindBy(css ="img[class='trello-main-logo']")
   WebElement imgTrello;
 
   
   @FindBy(id="login-error")
   WebElement Error;
   
   Actions action;
   
   public void jaibalayya(String usrName) {
	   userName.sendKeys(usrName);
	   
   }
   
  public WebElement getUserName() {
	return userName;
}
public void setUserName(WebElement userName) {
	this.userName = userName;
}
@SuppressWarnings("unused")
public void login(String uname,String password) throws Throwable {
		 action = new Actions(driver);
		 userName.sendKeys(uname);
		 continueButton.submit();
		 Thread.sleep(2000);
		 pwd.sendKeys(password);
		 loginButton.submit();
		 Thread.sleep(3000);
   }
   public void Error_Method() {
	   System.out.println(Error.getText());	
   }
   public boolean validateTrelloImg() {
	   return imgTrello.isDisplayed();
   }
}
