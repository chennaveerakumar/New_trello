package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() {
		File file=new File("./Configaration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	//Create methods to read the data
	 public String getApplicationURL() {
		String baseURL = prop.getProperty("baseURL");
		 return baseURL;
	 }
	public String getUserNameText() {
		String uname = prop.getProperty("uname");
		return uname;
	}
	public String getPasswordText() {
		String password = prop.getProperty("password");
		return password;
	}
	public String getChromePath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	public String getTitleText() {
		String boardTitle = prop.getProperty("boardTitle");
		return boardTitle;
	}
//	public String getInviteMailId() {
//		String inviteMailId = prop.getProperty("inviteMailId");
//		return inviteMailId;
//	}
	 // To Genearte Random G-mail
	
    public String generateRandomEmailAddress() {
  	  Date date=new Date();
  	  return date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
    }
}
