package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
         public WebDriver driver;
		
		public AdminUserPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
	
		}
		
	
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement clicknew;
		@FindBy(id="username")WebElement newusername;
		@FindBy(id="password")WebElement newpassword;
		@FindBy(id="user_type")WebElement usertype;
		@FindBy(xpath="//button[@name='Create']")WebElement saveuser;
		@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement search;
		@FindBy(id="un")WebElement searchusername;
		@FindBy(id="ut")WebElement searchusertype;
		@FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
		@FindBy(xpath="//a[contains(@class,'btn-warning')]")WebElement reset;
		
		
		public void clickNew() {
			clicknew.click();
			}
		public void enterNewUsernameInUsernameField(String newusernamevalue) {
			newusername.sendKeys(newusernamevalue);
		}
		public void enterNewPasswordInPasswordField(String newpasswordvalue) {
			newpassword.sendKeys(newpasswordvalue);
		}
		public void selectUserType(){
			Select select= new Select(usertype);
			select.selectByIndex(2);
		}
		public void clickOnSaveButton() {
		   saveuser.click();
		}
		public void clickOnSearchButton() {
			search.click();
		}
		public void enterUsernameForSearch(String searchuservalue) {
			searchusername.sendKeys(searchuservalue);
		}
		public void selectUsertypeForSearch() {
			Select select=new Select(searchusertype);
			select.selectByIndex(2);
		}
		public void 
		clickSearch() {
			searchbutton.click();
		}
		public void clickReset() {
		reset.click();
		}
		}
		
		

