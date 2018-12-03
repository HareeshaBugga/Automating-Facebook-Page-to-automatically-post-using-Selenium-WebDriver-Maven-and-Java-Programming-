package fb.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefb 
{
	WebDriver driver;
	
	@FindBy(how = How.ID , using = "email") 
	WebElement EmailElement;
	
	@FindBy(how = How.ID , using = "pass") 
	WebElement PasswordElement;
	
	@FindBy(how = How.ID , using = "loginbutton") 
	WebElement LoginElement;
	
	public LoginPagefb(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

		
	}
	
	public void setUsername(String username) {
		EmailElement.click();
		EmailElement.clear();
		EmailElement.sendKeys(username);
		
	}
	
	public void setPassword(String password) {
		PasswordElement.click();
		PasswordElement.clear();
		PasswordElement.sendKeys(password);
		
	}
	
	public void loginFb() {
		LoginElement.click();
		
	}
}



