package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	
	public void selectDropdownByIndex(WebElement element, int index) { 
		  
 		Select dropdown = new Select(element); 
 		dropdown.selectByIndex(index); 
 	}

}
