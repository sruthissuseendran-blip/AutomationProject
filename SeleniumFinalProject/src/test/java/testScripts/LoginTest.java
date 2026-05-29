package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Basepage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Basepage {
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		
		String usernamevalue=ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordvalue=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);		
		loginpage.enterUsernameInUsernameField(usernamevalue);
		loginpage.enterPasswordInPasswordField(passwordvalue);
		loginpage.SignButtonClick();
		
	}
	@Test
	public void verifyLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernamevalue=ExcelUtility.readStringData(1, 0, "LoginPage");
	    String passwordvalue=ExcelUtility.readStringData(1, 1, "LoginPage")	;
	    LoginPage loginpage= new LoginPage(driver);
	    loginpage.enterUsernameInUsernameField(usernamevalue);
	    loginpage.enterPasswordInPasswordField(passwordvalue);
	    loginpage.SignButtonClick();
	}
	@Test
	public void verifyLoginWithInvalidPasswordAndValidUsername() throws IOException {
   	 String userNamevalue = ExcelUtility.readStringData(2, 0,"LoginPage");
        String passwordvalue = ExcelUtility.readStringData(2, 1, "LoginPage");

        LoginPage loginpage = new LoginPage(driver);

        loginpage.enterUsernameInUsernameField(userNamevalue);
        loginpage.enterPasswordInPasswordField(passwordvalue);
        loginpage.SignButtonClick();
		
    }
	@Test
	public void verifyLoginWithInvalidCredentials() throws IOException {
   	 String userNamevalue = ExcelUtility.readStringData(3, 0,"LoginPage");
        String passwordvalue = ExcelUtility.readStringData(3, 1, "LoginPage");

        LoginPage loginpage = new LoginPage(driver);

        loginpage.enterUsernameInUsernameField(userNamevalue);
        loginpage.enterPasswordInPasswordField(passwordvalue);
        loginpage.SignButtonClick();
		
	}
}
