package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='loop-container']//a")
	WebElement logout_btn;

	
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
    
    public void displayed_logout_btn() {
		
     logout_btn.isDisplayed();
  	}
}
