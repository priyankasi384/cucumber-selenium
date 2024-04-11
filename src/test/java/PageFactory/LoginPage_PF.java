package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement username_txt;

	@FindBy(id="password")
	WebElement password_txt;
	
	@FindBy(id="submit")
	WebElement login_btn;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enter_username(String username) {
		
		username_txt.sendKeys(username);
	}
	
    public void enter_password(String password) {
		
    	password_txt.sendKeys(password);
	}
    
    public void click_loginbtn() {
		
  	login_btn.click();
  	}
}
