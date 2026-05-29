package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Basepage;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Basepage {
@Test
public void verifyLoginWithValidCredentials() throws IOException {

		String usernamevalue=ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordvalue=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage loginpage= new LoginPage(driver);		
		loginpage.enterUsernameInUsernameField(usernamevalue);
		loginpage.enterPasswordInPasswordField(passwordvalue);
		loginpage.SignButtonClick();
		
		HomePage home=new HomePage(driver);
		home.adminMoreInfo();
		
		String clicknew=ExcelUtility.readStringData(0, 0, "HomePage");
		AdminUserPage admin= new AdminUserPage(driver);
		admin.clickNew();
		admin.new
		
				}
}