package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Basepage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Basepage {
	@Test
public void verifyUserLogoutAfterLogin() throws IOException  {
		
		String usernamevalue=ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordvalue=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);		
		loginpage.enterUsernameInUsernameField(usernamevalue);
		loginpage.enterPasswordInPasswordField(passwordvalue);
		loginpage.SignButtonClick();
		HomePage homepage=new HomePage(driver);
		homepage.clickAdmin();
		homepage.clickLogout();
}

}
   