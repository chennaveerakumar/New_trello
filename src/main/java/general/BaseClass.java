package general;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadConfig;
import utils.TimeOuts;

public class BaseClass {
  ReadConfig readconfig=new ReadConfig();
  public String baseURL=readconfig.getApplicationURL();
  public String uname=readconfig.getUserNameText();
  public String password=readconfig.getPasswordText();
  public String title=readconfig.getTitleText();
  public String email=readconfig.generateRandomEmailAddress();

  public static WebDriver driver;
//  public LoginPage lp = new LoginPage(driver);
  public LoginPage lp;
  @BeforeClass
  public void setUp() {
//	 System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	 WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver(); 
	
	 driver.get(baseURL);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().timeouts().pageLoadTimeout(TimeOuts.Pageload_Time,TimeUnit.SECONDS);
	   lp =new LoginPage(driver);
	  }
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
